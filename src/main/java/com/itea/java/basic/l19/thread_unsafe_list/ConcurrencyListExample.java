package com.itea.java.basic.l19.thread_unsafe_list;

public class ConcurrencyListExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            fillListParallel();
        }
    }

    private static void fillListParallel() {
        MyList myList = new MyList();

        for (int i = 0; i < 20; i++) {
            new ListFillingThread(myList, i).start();
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myList.sort();

        System.out.println(myList.size());
        System.out.println(myList + "\n");
    }

    private static class ListFillingThread extends Thread {

        private MyList myList;
        private int number;

        public ListFillingThread(MyList myList, int number) {
            this.myList = myList;
            this.number = number;
        }

        @Override
        public void run() {
            synchronized (myList) {
                myList.add(number);
            }
        }
    }
}
