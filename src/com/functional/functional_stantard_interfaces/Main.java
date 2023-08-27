package com.functional.functional_stantard_interfaces;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Random random = new Random();

        Integer total = Flux.integerList(10, () -> random.nextInt(10))
                        .doSomething(System.out::print)
                        .filter((Integer value) -> value % 2 == 0)
                        .transform((Integer value) -> (int) Math.pow(value, 3))
                        .doSomething(System.out::println)
                        .sumValues(0, Integer::sum);

        System.out.println("Total: " + total);
    } 
}
