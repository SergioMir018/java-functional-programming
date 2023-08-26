package com.functional.flux.interfaces;

@FunctionalInterface
public interface Operation<T, U, R> {

    R sum(T value1, U value2);
}
