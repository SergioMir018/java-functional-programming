package com.funtional.superfuntions_classes;

import com.funtional.superfuntions_classes.interfaces.Predicate;
import com.funtional.superfuntions_classes.interfaces.IntegerList;
import com.funtional.superfuntions_classes.interfaces.TransformList;

import java.util.ArrayList;
import java.util.List;

public class SuperFunctions {

    public static List<Integer> filter(List<Integer> values, Predicate predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value:values) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static List<Integer> integerList(int size, IntegerList list) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            result.add(list.obtain());
        }
        return result;
    }

    public static List<Integer> transform(List<Integer> values, TransformList list) {
        List<Integer> result = new ArrayList<>();

        for (Integer value:values) {
            result.add(list.transform(value));
        }

        return result;
    }
}
