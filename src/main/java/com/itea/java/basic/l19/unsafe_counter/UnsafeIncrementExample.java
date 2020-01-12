package com.itea.java.basic.l19.unsafe_counter;

public class UnsafeIncrementExample {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            incrementNumberExample();
        }
    }

    private static void incrementNumberExample() {
        Number number = new Number();
        for (int i = 0; i < 100; i++) {
            new IncrementThread(number).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);
    }

    private static class IncrementThread extends Thread {

        private Number number;

        public IncrementThread(Number number) {
            this.number = number;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number.increment();
        }
    }
}
