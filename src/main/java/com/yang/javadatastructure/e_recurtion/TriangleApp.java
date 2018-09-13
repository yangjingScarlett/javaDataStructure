package com.yang.javadatastructure.e_recurtion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @Author: jing yang 
 * @Date: 2018-09-04 17:31:00 
 * 
 * 输入一个数据，返回这个数据的三角数，用递归函数实现
 * a(n) = n + a(n-1);
 * 
 *  特点：其实递归的效率比一般的循环低，人们采用它是因为递归从概念上简化了问题，而不是效率高。
 *  递归的应用：三角数字，阶乘，变位字，递归的二分查找，汉诺塔问题，归并排序等。。。
 */
public class TriangleApp {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        System.out.println("Please enter a num :");
        int n = Integer.valueOf(reader.readLine());
        int total = triangle(n);
        System.out.println("The triangle value of [" + n + "] is " + total);
    }

    private static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + triangle(n - 1));
        }
    }
}