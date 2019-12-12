package com.yang.javadatastructure.i_designpattern.c4_singleton_pattern;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class JDBCSingleton {
    private static JDBCSingleton instance;
    private MongoDatabase database = getDataBase();

    private JDBCSingleton() {

    }

    public static JDBCSingleton getInstance() {
        if (instance == null) {
            synchronized (JDBCSingleton.class) {
                if (instance == null) {
                    instance = new JDBCSingleton();
                }
            }
        }
        return instance;
    }

    private MongoDatabase getDataBase() {
        MongoDatabase mongoDatabase = null;

        JSONParser jsonParser = new JSONParser();
        String dbConfFile = "dbconfig.json";
        String localDBFlag = "localDB";
        String remoteDBFlag = "remoteDB";
        String addressFlag = "address";
        String portFlag = "port";
        String userFlag = "user";
        String pwdFlag = "pwd";
        String authDatabase = "auth-database";
        String databaseFlag = "database";

        try {
            JSONObject DB_CONF = null;
            URL path = JDBCSingleton.class.getClassLoader().getResource(dbConfFile);
            if (path != null) {
                File f = new File(path.toURI());
                DB_CONF = (JSONObject) jsonParser.parse(new FileReader(f));
            }
            if (DB_CONF == null) {
                throw new Exception("DB config file is null!");
            }
            final JSONObject DB = (JSONObject) DB_CONF.get(remoteDBFlag);
            if (DB == null) {
                throw new Exception("The " + remoteDBFlag + " DB config is null!");
            }

            final String ADDRESS = (String) DB.get(addressFlag);
            final int PORT = ((Long) DB.get(portFlag)).intValue();
            final String USERNAME = (String) DB.get(userFlag);
            final String PWD = (String) DB.get(pwdFlag);
            final String AUTH_DATABASE = (String) DB.get(authDatabase);
            final String DATABASE = (String) DB.get(databaseFlag);

            ServerAddress addr = new ServerAddress(ADDRESS, PORT);
            // createCredential function is for creating authentication for the database
            // it has three parameters: username, auth-database, pwd. pay attention the auth-database may be not the same with the database you want to use
            MongoCredential credential = MongoCredential.createCredential(USERNAME, AUTH_DATABASE, PWD.toCharArray());

            MongoClientOptions options = MongoClientOptions.builder()
                    .serverSelectionTimeout(10000)
                    .build();
            MongoClient mongoClient = new MongoClient(addr, Collections.singletonList(credential), options);

            mongoDatabase = mongoClient.getDatabase(DATABASE);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        // local db without authentication
//        MongoClient client = new MongoClient( ADDRESS , PORT );
//        MongoDatabase mongoDatabase = client.getDatabase(DATABASE);

        System.out.println("Connect to database successfully...");

        return mongoDatabase;
    }

    public void insertUser(String name, String pwd) throws Exception {
        String username = "username";
        String password = "pwd";
        MongoCollection<Document> collection = database.getCollection("user");
        Map<String, Object> map = new HashMap<>();
        map.put(username, name);
        map.put(password, pwd);
        Document document = new Document(map);
        collection.insertOne(document);
        System.out.println("Insert successfully!");
    }

    public void viewAllUser() throws Exception {
        MongoCollection<Document> collection = database.getCollection("user");
        FindIterable<Document> iterable = collection.find();
        for (Document doc : iterable) {
            System.out.println(doc);
        }
    }

    public Document findOneUser(String name) throws Exception {
        String username = "username";
        MongoCollection<Document> collection = database.getCollection("user");
        FindIterable<Document> iterable = collection.find(Filters.eq(username, name));
        return iterable.first();
    }

    public void updateUser(String name, String pwd) throws Exception {
        MongoCollection<Document> collection = database.getCollection("user");
        String username = "username";
        String password = "pwd";

        collection.updateMany(Filters.eq(username, name), new Document("$set", new Document(password, pwd)));
        Document newDoc = findOneUser(name);
        System.out.println(newDoc);
        System.out.println("Update successfully!");
    }

    public void deleteOneUser(String name) throws Exception {
        MongoCollection<Document> collection = database.getCollection("user");
        String username = "username";

        collection.deleteOne(Filters.eq(username, name));
        System.out.println("Delete successfully!");
    }
}
