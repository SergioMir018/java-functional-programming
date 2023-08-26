package com.functional.flux;

import com.functional.flux.interfaces.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        Integer total =
                Flux.integerList(10, new IntegerList<Integer>() {
                            private static int next = 0;

                            @Override
                            public Integer obtain() {
                                return next++;
                            }
                        }).filter((Integer value) -> value % 2 == 0)
                        .transform((Integer value) -> (int) Math.pow(value, 3))
                        .doSomething(System.out::println)
                        .sumValues(0, Integer::sum);

        System.out.println("Total: " + total);
    }
}
