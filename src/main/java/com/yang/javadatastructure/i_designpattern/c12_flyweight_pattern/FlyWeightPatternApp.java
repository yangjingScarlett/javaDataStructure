package com.yang.javadatastructure.i_designpattern.c12_flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Jing Yang
 * @date: 12/26/2019
 */
public class FlyWeightPatternApp {

    public static void main(String[] args) {
        List<Character> compositeState = new ArrayList<>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('d');
        compositeState.add('e');
        compositeState.add('f');

        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight compositeFly1 = factory.getFlyWeight(compositeState);
        FlyWeight compositeFly2 = factory.getFlyWeight(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("------------------------------------------");
        System.out.println("if Composite Flyweight pattern can share object: " + (compositeFly1 == compositeFly2));

        char state = 'a';
        FlyWeight fly1 = factory.getFlyWeight(state);
        FlyWeight fly2 = factory.getFlyWeight(state);
        System.out.println("if pure Flyweight pattern can share object: " + (fly1 == fly2));
    }
}
