package com.functional.superfuntions_classes.classes;

import com.functional.superfuntions_classes.interfaces.Predicate;

public class OnlyEven implements Predicate {
    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
