package com.imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //TODO
        // 1 - Create a list of integers
        var numbers = createList();
        System.out.println(numbers);
        // 2 - Filter only the even numbers
        var evenNumbers = filterEvenNumbers(numbers);
        System.out.println(evenNumbers);
        // 3 - Elevate all the numbers to the square
        var squareNumbers = toSquare(evenNumbers);
        System.out.println(squareNumbers);
        // 4 - Show all the square numbers on screen
        var showedList = showList(squareNumbers);
        // 5 - Get the sum of all the square numbers
        var sumOfSquareNumbers = sumList(showedList);
        System.out.println(sumOfSquareNumbers);
    }

    private List<Integer> createList() {
        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,144);
    }

    private List<Integer> filterEvenNumbers(List<Integer> listOfNumbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number:listOfNumbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    private List<Integer> toSquare(List<Integer> listOfNumbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number:listOfNumbers) {
            result.add((int) Math.pow(number, 2));
        }

        return result;
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
