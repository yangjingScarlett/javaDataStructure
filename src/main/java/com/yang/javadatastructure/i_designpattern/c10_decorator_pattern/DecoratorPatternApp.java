package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class DecoratorPatternApp {

    public static void main(String[] args) {
        Beverage beverage1 = new Coco();
        System.out.println(beverage1.getDesc() + ", $" + beverage1.cost());

        Beverage beverage2 = new Espresso();
        System.out.println(beverage2.getDesc() + ", $" + beverage2.cost());

        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDesc() + ", $" + beverage1.cost());

        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDesc() + ", $" + beverage2.cost());
    }
}
