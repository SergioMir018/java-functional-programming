package com.funtional.superfuntions_classes.classes;

import com.funtional.superfuntions_classes.interfaces.IntegerList;
import com.funtional.superfuntions_classes.interfaces.TransformList;

public class SquareUp implements TransformList {
    @Override
    public Integer transform(int value) {
        return (int) Math.pow(value, 2);
    }
}
