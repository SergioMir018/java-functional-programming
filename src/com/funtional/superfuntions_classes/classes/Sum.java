package com.funtional.superfuntions_classes.classes;

import com.funtional.superfuntions_classes.interfaces.Operation;

public class Sum implements Operation {
    @Override
    public Integer sum(Integer value1,  Integer value2) {
        return value1 + value2;
    }
}
