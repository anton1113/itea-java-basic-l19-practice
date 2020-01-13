package com.itea.java.basic.l19.classwork.calculator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class CalculatorUserRunnable implements Runnable {

    private static final Random RANDOM = new Random();

    private ThreadUnsafeCalculator calculator;

    public CalculatorUserRunnable(ThreadUnsafeCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        int a = RANDOM.nextInt(10);
        int b = RANDOM.nextInt(10);
        int sum = calculator.plus(a, b);

        LocalTime now = LocalTime.now();
        String comment = a + b == sum ? "right!" : "wrong!";
        System.out.printf("%s %d + %d = %d, %s\n", now, a, b, sum, comment);
    }
}
