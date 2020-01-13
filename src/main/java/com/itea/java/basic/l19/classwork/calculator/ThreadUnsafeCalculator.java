package com.itea.java.basic.l19.classwork.calculator;

public class ThreadUnsafeCalculator {

    private Object mutexObj = new Object();

    private int a;
    private int b;

    private int result;

    public int plus(int a, int b) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (mutexObj) {
            this.a = a;
            this.b = b;
            this.result = this.a + this.b;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
