package com.itea.java.basic.l19.unsafe_counter;

public class Number {

    private int value;

    public void increment() {
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = value + 1;
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
