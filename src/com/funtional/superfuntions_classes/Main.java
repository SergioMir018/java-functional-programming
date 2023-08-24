package com.funtional.superfuntions_classes;

import com.funtional.superfuntions_classes.classes.Naturals;
import com.funtional.superfuntions_classes.classes.OnlyEven;
import com.funtional.superfuntions_classes.classes.RandomNumber;
import com.funtional.superfuntions_classes.classes.SquareUp;

import java.util.ArrayList;
import java.util.List;

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
        var squareNumbers = SuperFunctions.transform(filteredNumbers, new SquareUp());
        System.out.println(squareNumbers);
        // 4 - Show all the square numbers on screen
        var showedList = showList(squareNumbers);
        // 5 - Get the sum of all the square numbers
        var sumOfSquareNumbers = sumList(showedList);
        System.out.println(sumOfSquareNumbers);
    }

    private List<Integer> showList(List<Integer> listOfNumbers) {
        for (Integer number:listOfNumbers) {
            System.out.println(number);
        }

        return listOfNumbers;
    }

    private Integer sumList(List<Integer> listOfNumbers) {
        int total = 0;

        for (Integer number:listOfNumbers) {
            total += number;
        }

        return total;
    }
}
