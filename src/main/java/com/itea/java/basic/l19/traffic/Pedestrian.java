package com.itea.java.basic.l19.traffic;

public class Pedestrian implements Runnable {

    private TrafficLight trafficLight;

    public Pedestrian(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        trafficLight.goPedestrian();
    }
}
