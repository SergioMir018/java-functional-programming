package com.funtional.superfuntions_classes.classes;

import com.funtional.superfuntions_classes.interfaces.Predicate;

public class OnlyNotEven implements Predicate {
    @Override
    public boolean test(Integer value) {
        return value % 2 != 0;
    }
}
