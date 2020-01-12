package com.itea.java.basic.l19.producer_consumer.util;

import java.time.LocalTime;
import java.util.Random;

public abstract class WarehouseUtils {

    private static final Random RANDOM = new Random();

    public static void sleepRandomTime(int min, int max) {
        sleep(min + RANDOM.nextInt(max - min));
    }

    public static void log(String message) {
        System.out.printf("%s %s: %s\n", LocalTime.now(), Thread.currentThread().getName(), message);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
