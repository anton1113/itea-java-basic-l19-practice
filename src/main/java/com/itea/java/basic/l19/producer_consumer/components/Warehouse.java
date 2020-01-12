package com.itea.java.basic.l19.producer_consumer.components;

public class Warehouse {

    private String[] goods;
    private int goodsCount;

    public Warehouse(int capacity) {
        this.goods = new String[capacity];
        this.goodsCount = 0;
    }

    public synchronized void put(String cargo) {
        while (isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        goods[goodsCount++] = cargo;
        notify();
    }

    public synchronized String get() {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String cargo = goods[--goodsCount];
        notify();
        return cargo;
    }

    private boolean isEmpty() {
        return goodsCount == 0;
    }

    private boolean isFull() {
        return goodsCount == goods.length;
    }
}
