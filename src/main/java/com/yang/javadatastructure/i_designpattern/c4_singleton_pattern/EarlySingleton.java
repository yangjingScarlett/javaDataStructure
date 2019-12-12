package com.yang.javadatastructure.i_designpattern.c4_singleton_pattern;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class EarlySingleton {

    // The static instance is created when it is declared, that means it is created at the time of class loading,
    // and it gets memory only once because of static.
    private static EarlySingleton instance = new EarlySingleton();

    // The private constructor will prevent to instantiated the Singleton class from outside the class.
    private EarlySingleton() {
    }

    // This static method provides a global point of access to the Singleton class and returns the only instance.
    public static EarlySingleton getInstance() {
        return instance;
    }
}
