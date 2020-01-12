package com.itea.java.basic.l19.unsafe_calculator;

public class Calculator {

    private int a;
    private int b;

    public int sum(int a1, int a2) {
        sleep();
        this.a = a1;
        sleep();
        this.b = a2;
        sleep();
        return this.a + this.b;
    }

    private void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
