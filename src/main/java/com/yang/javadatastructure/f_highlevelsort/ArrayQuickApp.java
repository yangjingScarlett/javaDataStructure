package com.yang.javadatastructure.f_highlevelsort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-05 16:20:05 
 */
public class ArrayQuickApp {

    public static void main(String[] args) {
        ArrayQuick arrayQuick = new ArrayQuick(50);

        for (int i = 0; i < 18; i++) {
            arrayQuick.insert((long) (Math.random() * 100));
        }
        arrayQuick.display();
        arrayQuick.sortByQuick(0, arrayQuick.getSize() - 1);
        arrayQuick.display();
    }
}