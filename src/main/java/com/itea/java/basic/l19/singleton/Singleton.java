package com.itea.java.basic.l19.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton();
        }
        return instance;
    }
}
