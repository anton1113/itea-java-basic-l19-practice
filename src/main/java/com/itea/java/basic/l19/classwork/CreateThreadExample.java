package com.itea.java.basic.l19.classwork;

public class CreateThreadExample {

    public static void main(String[] args) {

        Thread thread1 = new HelloThread();
        Thread thread2 = new Thread(new HelloRunnable());
        Thread thread3 = new Thread(() -> System.out.println("3Hello world!"));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static class HelloRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("1Hello world!");
        }
    }

    private static class HelloThread extends Thread {

        @Override
        public void run() {
            System.out.println("2Hello world!");
        }
    }
}
