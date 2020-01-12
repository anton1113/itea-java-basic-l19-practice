package com.itea.java.basic.l19.examples;

public class SynchronizedExample {

    public static void main(String[] args) {
        synchronized (new Object()) {
            // ...
        }
    }

    public synchronized void method() {
//        while (this.getMutex().isLocked()) {
//            Thread.sleep(1);
//        }
//        this.getMutex().lock();
//        someLogic();
//        this.getMutex().unlock();
    }

    private void someLogic() {

    }
}
