package com.functional.flux.interfaces;

public interface TransformList<T, R> {

    R transform(T value);
}
