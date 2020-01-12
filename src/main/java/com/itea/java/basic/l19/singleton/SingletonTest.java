package com.itea.java.basic.l19.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest {

    public static void main(String[] args) {

        List<SingletonProviderThread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new SingletonProviderThread());
        }

        threads.forEach(Thread::start);

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Singleton standard = Singleton.getInstance();
        threads.forEach(thread -> {
            if (thread.getSingletonInstance() != standard) {
                throw new RuntimeException("Test failed!");
            }
        });
    }

    private static class SingletonProviderThread extends Thread {

        private Singleton instance;

        public Singleton getSingletonInstance() {
            return instance;
        }

        @Override
        public void run() {
            instance = Singleton.getInstance();
        }
    }
}
