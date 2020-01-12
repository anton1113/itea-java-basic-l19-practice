package com.itea.java.basic.l19.producer_consumer.components;

import com.itea.java.basic.l19.producer_consumer.util.WarehouseUtils;

public class Producer implements Runnable {

    private Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            WarehouseUtils.sleepRandomTime(100, 1000);
            String cargo = "Cargo #" + count++;
            warehouse.put(cargo);
            WarehouseUtils.log("stored " + cargo + " to warehouse");
        }
    }
}
