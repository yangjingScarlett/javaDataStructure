package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang 
 * @Date: 2018-08-31 16:06:59 
 */
public class CreateArray {

    public static void main(String[] args) {
        /* 创建固定长度的数组 *********************************/
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        System.out.print("a:[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");

        /* 创建固定长度的数组 *********************************/
        int[] b = new int[5];
        b[0] = 6;
        b[1] = 7;
        b[2] = 8;
        b[3] = 9;
        b[4] = 10;

        System.out.print("b:[");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");

        /* 创建固定长度的数组 *********************************/
        int[] c;
        c = new int[5];
        c[0] = 11;
        c[1] = 12;
        c[2] = 13;
        c[3] = 14;
        c[4] = 15;

        System.out.print("c:[");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");

        /* 创建固定长度的数组 *********************************/
        int[] d = { 16, 17, 18, 19, 20 };
        System.out.print("d:[");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println("]");
    }
}