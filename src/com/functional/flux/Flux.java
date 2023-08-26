package com.functional.flux;

import com.functional.flux.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Flux<T> {

    private final List<T> values;

    public Flux(List<T> values) {
        this.values = values;
    }

    public static <T> Flux<T> integerList(int size, IntegerList<T> list) {
        List<T> result = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            result.add(list.obtain());
        }
        return new Flux<>(result);
    }

    public Flux<T> filter(Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T value:values) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return new Flux<>(result);
    }

    public <R> Flux<R> transform(TransformList<T, R> list) {
        List<R> result = new ArrayList<>();

        for (T value:values) {
            result.add(list.transform(value));
        }

        return new Flux<>(result);
    }

    public Flux<T> doSomething(Consumer<T> consumer) {
        for (T value:values) {
            consumer.consume(value);
        }

        return new Flux<>(values);
    }

    public T sumValues(T entity, BinaryOperation<T> opt) {
        T result = entity;

        for (T value:values) {
            result = opt.sum(value, result);
            System.out.println(result);
        }

        return result;
    }

    @Override
    public String  toString() {
        return values.toString();
    }
}
