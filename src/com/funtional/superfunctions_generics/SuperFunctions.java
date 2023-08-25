package com.funtional.superfunctions_generics;

import com.funtional.superfunctions_generics.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class SuperFunctions {

    public static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T value:values) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static <T> List<T> integerList(int size, IntegerList<T> list) {
        List<T> result = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            result.add(list.obtain());
        }
        return result;
    }

    public static <T, R> List<R> transform(List<T> values, TransformList<T, R> list) {
        List<R> result = new ArrayList<>();

        for (T value:values) {
            result.add(list.transform(value));
        }

        return result;
    }

    public static <T> List<T> doSomething(List<T> values, Consumer<T> consumer) {
        for (T value:values) {
            consumer.consume(value);
        }

        return values;
    }

    public static <T> T sumValues(T entity, List<T> values, BinaryOperation<T> opt) {
        T result = entity;

        for (T value:values) {
            result = opt.sum(value, result);
            System.out.println(result);
        }

        return result;
    }
}
