package com.itea.java.basic.l19.classwork.calculator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ThreadUnsafeCalculator calculator = new ThreadUnsafeCalculator();

        new Thread(new CalculatorUserRunnable(calculator)).start();
        new Thread(new CalculatorUserRunnable(calculator)).start();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(new CalculatorUserRunnable(calculator)));
        }

        threads.forEach(t -> t.start());
    }
}
