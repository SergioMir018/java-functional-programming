package com.functional.streams;

import lombok.Getter;

@Getter
public class Description {

    private final Integer value;

    public Description(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "V (" + value + ")";
    }
}
