package com.functional.superfuntions_classes;

import com.functional.superfuntions_classes.classes.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //TODO
        // 1 - Create a list of integers
        var numbers = SuperFunctions.integerList(10, new Naturals());
        System.out.println(numbers);
        // 2 - Filter only the even numbers
        var filteredNumbers = SuperFunctions.filter(numbers, new OnlyEven());
        System.out.println(filteredNumbers);
        // 3 - Elevate all the numbers to the square
        var transformedNumbers = SuperFunctions.transform(filteredNumbers, new CubeUp());
        System.out.println(transformedNumbers);
        // 4 - Show all the square numbers on screen
        var showedList = SuperFunctions.doSomething(transformedNumbers, new Printer());
        // 5 - Get the sum of all the square numbers
        var sumOfSquareNumbers = SuperFunctions.sumValues(0, showedList, new Sum());
        System.out.println(sumOfSquareNumbers);
    }
}
