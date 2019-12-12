package com.yang.javadatastructure.i_designpattern.c4_singleton_pattern;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton(); // install will be created at required time.
                }
            }
        }
        return instance;
    }
}
