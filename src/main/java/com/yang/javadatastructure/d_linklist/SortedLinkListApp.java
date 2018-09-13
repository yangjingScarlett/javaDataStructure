package com.yang.javadatastructure.d_linklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 18:00:07 
 */
public class SortedLinkListApp {

    public static void main(String[] args) throws NumberFormatException, IOException {

        SortedLinkList sortedLinkList = new SortedLinkList();
        int[] arr = new int[10];

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(reader.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("");
        
        for (int i = 0; i < arr.length; i++) {
            sortedLinkList.insert(arr[i], arr[i] * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedLinkList.remove().id;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("");
    }
}