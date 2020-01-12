package com.itea.java.basic.l19.producer_consumer.factory;

import com.itea.java.basic.l19.producer_consumer.components.Consumer;
import com.itea.java.basic.l19.producer_consumer.components.Warehouse;

import java.util.ArrayList;
import java.util.List;

public abstract class ConsumerFactory {

    public static List<Thread> createConsumers(int count, Warehouse warehouse) {
        List<Thread> consumers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Thread consumer = new Thread(new Consumer(warehouse));
            consumer.setName("Consumer #" + (i + 1));
            consumers.add(consumer);
        }
        return consumers;
    }
}
