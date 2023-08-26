package com.functional.flux.interfaces;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T value);
}
