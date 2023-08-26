package com.functional.superfuntions_classes.classes;

import com.functional.superfuntions_classes.interfaces.IntegerList;

public class Naturals implements IntegerList {
    private static int next = 0;

    @Override
    public Integer obtain() {
        return next++;
    }
}
