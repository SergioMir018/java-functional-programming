package com.functional.superfuctions_inline_classes;

import com.functional.superfuctions_inline_classes.interfaces.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //TODO
        // 1 - Create a list of integers
        var numbers = SuperFunctions.integerList(10, new IntegerList() {
            private static int next = 0;

            @Override
            public Integer obtain() {
                return next++;
            }
        });
        System.out.println(numbers);
        // 2 - Filter only the even numbers
        var filteredNumbers = SuperFunctions.filter(numbers, new Predicate() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println(filteredNumbers);
        // 3 - Elevate all the numbers to the square
        var transformedNumbers = SuperFunctions.transform(filteredNumbers, new TransformList() {
            @Override
            public Integer transform(int value) {
                return (int) Math.pow(value, 3);
            }
        });
        System.out.println(transformedNumbers);
        // 4 - Show all the square numbers on screen
        var showedList = SuperFunctions.doSomething(transformedNumbers, new Consumer() {
            @Override
            public void consume(Integer value) {
                System.out.println(value);
            }
        });
        // 5 - Get the sum of all the square numbers
        var sumOfSquareNumbers = SuperFunctions.sumValues(0, showedList, new Operation() {
            @Override
            public Integer sum(Integer value1,  Integer value2) {
                return value1 + value2;
            }
        });
        System.out.println(sumOfSquareNumbers);
    }
}
