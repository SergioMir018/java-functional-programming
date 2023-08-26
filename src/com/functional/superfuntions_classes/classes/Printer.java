package com.functional.superfuntions_classes.classes;

import com.functional.superfuntions_classes.interfaces.Consumer;

public class Printer implements Consumer {
    @Override
    public void consume(Integer value) {
        System.out.println(value);
    }
}
