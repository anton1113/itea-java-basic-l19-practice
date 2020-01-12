package com.itea.java.basic.l19.traffic;

public class TrafficLight {

    private State state;

    public TrafficLight() {
        new Thread(() -> {
            while (true) {
                switchLight();
                try {
                    Thread.sleep(5_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public synchronized void goCar() {
        while (state == State.GREEN) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Car goes by the street");
    }

    public synchronized void goPedestrian() {
        while (state == State.RED) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pedestrian cross the street");
    }

    private synchronized void switchLight() {
        if (state == State.RED) {
            state = State.GREEN;
        } else {
            state = State.RED;
        }
        System.out.println("The light is now " + state);
        notifyAll();
    }

    private enum State {
        GREEN,
        RED
    }
}
