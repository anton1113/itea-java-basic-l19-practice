package com.itea.java.basic.l19.producer_consumer;

import com.itea.java.basic.l19.producer_consumer.components.Warehouse;
import com.itea.java.basic.l19.producer_consumer.factory.ConsumerFactory;
import com.itea.java.basic.l19.producer_consumer.factory.ProducerFactory;

import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Warehouse warehouse = new Warehouse(1);

        List<Thread> producers = ProducerFactory.createProducers(10, warehouse);
        List<Thread> consumers = ConsumerFactory.createConsumers(3, warehouse);

        consumers.forEach(Thread::start);
        producers.forEach(Thread::start);
    }
}
