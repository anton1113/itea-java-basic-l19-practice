package com.itea.java.basic.l19.thread_unsafe_list;

public class MainThreadListExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            fillListWithMainThread();
        }
    }

    private static void fillListWithMainThread() {
        MyList myList = new MyList();

        for (int i = 0; i < 20; i++) {
            myList.add(i);
        }
        myList.sort();

        System.out.println(myList.size());
        System.out.println(myList + "\n");
    }
}
