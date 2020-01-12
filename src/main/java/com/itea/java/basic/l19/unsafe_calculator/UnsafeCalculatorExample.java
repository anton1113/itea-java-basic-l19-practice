package com.itea.java.basic.l19.unsafe_calculator;

import java.util.Random;

public class UnsafeCalculatorExample {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        for (int i = 0; i < 100; i++) {
            new CalculatorUsageThread(calculator).start();
        }
    }

    private static class CalculatorUsageThread extends Thread {

        Calculator calculator;

        public CalculatorUsageThread(Calculator calculator) {
            this.calculator = calculator;
        }

        @Override
        public void run() {
            Random random = new Random();
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            int sum = calculator.sum(a, b);
            System.out.printf("%d + %d = %d\n", a, b,sum);
        }
    }
}
