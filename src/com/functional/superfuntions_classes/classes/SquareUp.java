package com.functional.superfuntions_classes.classes;

import com.functional.superfuntions_classes.interfaces.TransformList;

public class SquareUp implements TransformList {
    @Override
    public Integer transform(int value) {
        return (int) Math.pow(value, 2);
    }
}
