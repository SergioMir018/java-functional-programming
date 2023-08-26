package com.functional.flux.interfaces;

@FunctionalInterface
public interface Consumer<T> {

    void consume(T value);
}
