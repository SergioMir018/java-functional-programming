package com.functional.streams;

public class NumberUtils {
    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int squareUp(int value) {
        return (int) Math.pow(value, 2);
    }
}
