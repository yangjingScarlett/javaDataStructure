package com.yang.javadatastructure.i_designpattern.c2_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/25/2019
 */
public class PlanFactory {

    public Plan getPlan(PlanType planType) {
        if (planType.equals(PlanType.DOMESTIC)) {
            return new DomesticPlan();
        } else if (planType.equals(PlanType.COMMERCIAL)) {
            return new CommercialPlan();
        } else if (planType.equals(PlanType.INSTITUTION)) {
            return new InstitutionPlan();
        } else {
            System.out.println("The planType is invalid! Please check and retry.");
            return null;
        }
    }
}
