package com.yang.javadatastructure.i_designpattern.c5_prototype_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class PrototypeApp {

    public static void main(String[] args) {
        Manager manager = new Manager();

        System.out.println("---------------Original Object---------------");
        MessageBox asteriskBox = new MessageBox('*');
        asteriskBox.use("Original Object");
        MessageBox slashBox = new MessageBox('/');
        slashBox.use("Original Object");
        Underline equalLine = new Underline('=');
        equalLine.use("Original Object");
        Underline dollarLine = new Underline('$');
        dollarLine.use("Original Object");
        manager.register("asteriskBox", asteriskBox);
        manager.register("slashBox", slashBox);
        manager.register("equalLine", equalLine);
        manager.register("dollarLine", dollarLine);

        System.out.println("---------------Cloned Object---------------");
        Prototype p1 = manager.create("asteriskBox");
        p1.use("Cloned Object");
        Prototype p2 = manager.create("slashBox");
        p2.use("Cloned Object");
        Prototype p3 = manager.create("equalLine");
        p3.use("Cloned Object");
        Prototype p4 = manager.create("dollarLine");
        p4.use("Cloned Object");
    }
}
