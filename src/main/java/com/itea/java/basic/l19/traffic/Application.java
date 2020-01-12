package com.itea.java.basic.l19.traffic;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(new Random().nextInt(2_000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(new Pedestrian(trafficLight)).start();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(new Random().nextInt(2_000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Thread(new Car(trafficLight)).start();
            }
        }).start();
    }
}
