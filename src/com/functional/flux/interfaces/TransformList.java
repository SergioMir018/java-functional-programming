package com.functional.flux.interfaces;

@FunctionalInterface
public interface TransformList<T, R> {

    R transform(T value);
}
