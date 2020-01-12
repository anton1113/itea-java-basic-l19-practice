package com.itea.java.basic.l19.traffic;

public class Car implements Runnable {

    private TrafficLight trafficLight;

    public Car(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        trafficLight.goCar();
    }
}
