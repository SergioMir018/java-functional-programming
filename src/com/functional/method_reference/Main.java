package com.functional.method_reference;

import java.util.Random;

public class Main {
    Random random = new Random();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Integer total = Flux.integerList(10, this::randomInt)
                        .order(Integer::compareTo)
                        .doSomething(System.out::print)
                        .filter(NumberUtils::isPrime)
                        .doSomething(System.out::print)
                        .transform(NumberUtils::squareUp)
                        .doSomething(System.out::println)
                        .sumValues(0, Integer::sum);

        System.out.println("Total: " + total);
    }

    private int randomInt() {
        return random.nextInt(10);
    }
}
