package com.yang.javadatastructure.i_designpattern.c1_strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Jing Yang
 * @date: 11/22/2019
 */
public class StrategyPatternApp {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input the first number: ");
            float a = Float.parseFloat(reader.readLine());
            System.out.println("Input the second number: ");
            float b = Float.parseFloat(reader.readLine());

            Calculation add = new Add();
            Calculation subtract = new Subtract();
            Calculation multiply = new Multiply();
            Calculation divide = new Divide();
            Examination examination1 = new Examination("Math Examination -- Add", add);
            System.out.println(String.format("%s, Result: %f", examination1.getName(), examination1.exam(a, b)));

            Examination examination2 = new Examination("Math Examination -- Subtract", subtract);
            System.out.println(String.format("%s, Result: %f", examination2.getName(), examination2.exam(a, b)));

            Examination examination3 = new Examination("Math Examination -- Multiply", multiply);
            System.out.println(String.format("%s, Result: %f", examination3.getName(), examination3.exam(a, b)));

            Examination examination4 = new Examination("Math Examination -- Divide", divide);
            System.out.println(String.format("%s, Result: %f", examination4.getName(), examination4.exam(a, b)));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
