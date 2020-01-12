package com.itea.java.basic.l19.thread_unsafe_list;

import java.util.Arrays;

public class MyList {

    private int[] values;
    private int size;

    public MyList() {
        this.values = new int[100];
        this.size = 0;
    }

    public void add(int i) {
//        System.out.println(Thread.currentThread().getName() + " entered add() method");
        sleep(1);
        values[size] = i;
        sleep(1);
        size = size + 1;
        sleep(1);
//        System.out.println(Thread.currentThread().getName() + " exited add() method");
    }

    public int size() {
        return size;
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (values[j] > values[i]) {
                    int tmp = values[i];
                    values[i] = values[j];
                    values[j] = tmp;
                }
            }
        }
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(values, size));
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
