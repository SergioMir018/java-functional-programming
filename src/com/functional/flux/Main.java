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
                }).filter(new Predicate<>() {
                    @Override

                    public boolean test(Integer value) {
                        return value % 2 == 0;
                    }
                }).transform(new SimpleTransform<>() {
                    @Override
                    public Integer transform(Integer value) {
                        return (int) Math.pow(value, 3);
                    }
                }).doSomething(new Consumer<>() {
                    @Override
                    public void consume(Integer value) {
                        System.out.println(value);
                    }
                }).sumValues(0, new BinaryOperation<>() {
                    @Override
                    public Integer sum(Integer value1,  Integer value2) {
                        return value1 + value2;
                    }
                });

        System.out.println("Total: " + total);
    }
}
