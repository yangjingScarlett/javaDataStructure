package com.yang.javadatastructure.i_designpattern.c4_singleton_pattern;

import org.bson.Document;

/**
 * @author: Jing Yang
 * @date: 12/4/2019
 */
public class JDBCSingletonApp {

    public static void main(String[] args) throws Exception {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        System.out.println("--------------insert---------------");
        jdbc.insertUser("aa", "pwdaa");
        System.out.println("--------------view---------------");
        jdbc.viewAllUser();
        System.out.println("--------------find---------------");
        Document user = jdbc.findOneUser("aa");
        System.out.println(user);
        System.out.println("--------------update---------------");
        jdbc.updateUser("aa", "pwdaaaaa");
        System.out.println("--------------delete---------------");
        jdbc.deleteOneUser("aa");
    }
}
