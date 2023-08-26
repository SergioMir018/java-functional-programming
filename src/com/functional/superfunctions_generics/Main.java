package com.functional.superfunctions_generics;

import com.functional.superfunctions_generics.interfaces.*;
import com.funtional.functional.superfunctions_generics.interfaces.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //TODO
        // 1 - Create a list of integers
        var numbers = SuperFunctions.integerList(10, new IntegerList<Integer>() {
            private static int next = 0;

            @Override
            public Integer obtain() {
                return next++;
            }
        });
        System.out.println(numbers);

        // 2 - Filter only the even numbers
        var filteredNumbers = SuperFunctions.filter(numbers, new Predicate<>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println(filteredNumbers);

        // 3 - Elevate all the numbers to the square
        var transformedNumbers = SuperFunctions.transform(filteredNumbers, new SimpleTransform<>() {
            @Override
            public Integer transform(Integer value) {
                return (int) Math.pow(value, 3);
            }
        });

        //3a - Transform the given array of Integers into an array of String

        var stringArray = SuperFunctions.transform(filteredNumbers, new TransformList<Integer, String>() {
            @Override
            public String transform(Integer value) {
                return value.toString();
            }
        });

        stringArray.forEach(element -> {
            if (element instanceof String) {
                System.out.println(element + " is a String");
            }
        });

        // 4 - Show all the square numbers on screen
        var showedList = SuperFunctions.doSomething(transformedNumbers, new Consumer<>() {
            @Override
            public void consume(Integer value) {
                System.out.println(value);
            }
        });

        // 5 - Get the sum of all the square numbers
        var sumOfSquareNumbers = SuperFunctions.sumValues(0, showedList, new BinaryOperation<>() {
            @Override
            public Integer sum(Integer value1,  Integer value2) {
                return value1 + value2;
            }
        });
        System.out.println(sumOfSquareNumbers);
    }
}
