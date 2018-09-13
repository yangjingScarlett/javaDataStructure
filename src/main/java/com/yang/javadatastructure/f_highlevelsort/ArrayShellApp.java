package com.yang.javadatastructure.f_highlevelsort;

/**
 * @author yangjing
 */
public class ArrayShellApp {

    public static void main(String[] args) {
        ArrayShell arrayShell = new ArrayShell(100);
        arrayShell.insert(88);
        arrayShell.insert(33);
        arrayShell.insert(44);
        arrayShell.insert(22);
        arrayShell.insert(66);
        arrayShell.insert(100);
        arrayShell.insert(77);
        arrayShell.insert(11);
        arrayShell.insert(99);
        arrayShell.insert(55);

        arrayShell.display();

        arrayShell.sortByShell();

        arrayShell.display();
    }
}
