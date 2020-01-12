package com.itea.java.basic.l19.producer_consumer.components;

import com.itea.java.basic.l19.producer_consumer.util.WarehouseUtils;

public class Consumer implements Runnable {

    private Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            WarehouseUtils.sleepRandomTime(100, 1000);
            String cargo = warehouse.get();
            WarehouseUtils.log("received " + cargo + " from warehouse");
        }
    }
}
