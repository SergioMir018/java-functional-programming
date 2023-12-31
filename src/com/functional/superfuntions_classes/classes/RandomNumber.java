package com.functional.superfuntions_classes.classes;

import com.functional.superfuntions_classes.interfaces.IntegerList;

import java.util.Random;

public class RandomNumber implements IntegerList {
    Random random = new Random();

    @Override
    public Integer obtain() {
        return random.nextInt(1000);
    }
}
