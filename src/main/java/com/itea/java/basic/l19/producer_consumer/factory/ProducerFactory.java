package com.itea.java.basic.l19.producer_consumer.factory;

import com.itea.java.basic.l19.producer_consumer.components.Producer;
import com.itea.java.basic.l19.producer_consumer.components.Warehouse;

import java.util.ArrayList;
import java.util.List;

public abstract class ProducerFactory {

    public static List<Thread> createProducers(int count, Warehouse warehouse) {
        List<Thread> producers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Thread producer = new Thread(new Producer(warehouse));
            producer.setName("Producer #" + (i + 1));
            producers.add(producer);
        }
        return producers;
    }
}
