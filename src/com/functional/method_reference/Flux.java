package com.functional.method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Flux<T> {

    private final List<T> values;

    public Flux(List<T> values) {
        this.values = values;
    }

    public static <T> Flux<T> integerList(int size, Supplier<T> list) {
        List<T> result = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            result.add(list.get());
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

    public <R> Flux<R> transform(Function<T, R> list) {
        List<R> result = new ArrayList<>();

        for (T value:values) {
            result.add(list.apply(value));
        }

        return new Flux<>(result);
    }

    public Flux<T> doSomething(Consumer<T> consumer) {
        for (T value:values) {
            consumer.accept(value);
        }

        System.out.println();

        return new Flux<>(values);
    }

    public Flux<T> order(Comparator<T> comparator) {
        List<T> orderedList = new ArrayList<>(values);

        orderedList.sort(comparator);

        return new Flux<>(orderedList);
    }

    public T sumValues(T entity, BinaryOperator<T> opt) {
        T result = entity;

        for (T value:values) {
            result = opt.apply(value, result);
        }

        return result;
    }

    @Override
    public String  toString() {
        return values.toString();
    }
}
