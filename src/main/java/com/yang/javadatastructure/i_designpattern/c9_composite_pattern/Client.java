package com.yang.javadatastructure.i_designpattern.c9_composite_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Making root components...");
        Folder rootdir = new Folder("root");
        Folder bindir = new Folder("bin");
        Folder tmpdir = new Folder("tmp");
        Folder usrdir = new Folder("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", "txt", 1000));
        bindir.add(new File("latex", "html", 2000));
        rootdir.printList("");

        System.out.println("");
        System.out.println("Making usr components");
        Folder yuki = new Folder("yuki");
        Folder hanako = new Folder("hanako");
        Folder tomura = new Folder("tomura");
        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomura);
        yuki.add(new File("diary", "html", 100));
        yuki.add(new File("Composite", "java", 200));
        hanako.add(new File("memo", "tex", 300));
        tomura.add(new File("game", "doc", 400));
        tomura.add(new File("junk", "mail", 500));
        rootdir.printList("");
    }
}
