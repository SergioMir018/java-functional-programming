package com.functional.optional;

import java.util.Comparator;
import java.util.Random;

public class Main {
    Random random = new Random();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Flux.integerList(10, this::randomInt)
                .order(Integer::compareTo)
                .doSomething(System.out::print)
                .filter(value -> value >= 0)
                .doSomething(System.out::print)
                .transform(NumberUtils::squareUp)
                .doSomething(System.out::println)
                //.sumValues(0, Integer::sum)
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        value -> System.out.println("Total: " + value),
                        () -> System.out.print("There is no max value because the flux is empty")
                        );
    }

    private int randomInt() {
        return random.nextInt(10);
    }
}
