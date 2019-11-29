package com.yang.javadatastructure.i_designpattern.c2_factory_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author: Jing Yang
 * @date: 11/25/2019
 */
public class FactoryPatternApp {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PlanFactory planFactory = new PlanFactory();
        int unit = 100;
        try {
            System.out.println("Please type the number of the plan you want to create: 1.Domestic; 2.Commercial; 3.Institution");
            int planType = Integer.parseInt(br.readLine());
            if (planType == 1) {
                planFactory.getPlan(PlanType.DOMESTIC).createPlan(unit);
            } else if (planType == 2) {
                planFactory.getPlan(PlanType.COMMERCIAL).createPlan(unit);
            } else if (planType == 3) {
                planFactory.getPlan(PlanType.INSTITUTION).createPlan(unit);
            } else {
                System.out.println("The planType is invalid! Please check and retry.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
