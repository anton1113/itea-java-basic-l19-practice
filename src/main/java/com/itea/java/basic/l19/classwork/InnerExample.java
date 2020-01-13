package com.itea.java.basic.l19.classwork;

// TODO common interview question
public class InnerExample {

    public static void main(String[] args) {

        B b = new B();

        InnerExample innerExample = new InnerExample();
        A a = innerExample.new A();

//        InnerExample innerExample = new InnerExample();
//        innerExample.m1();
//        InnerExample.m2();
    }

    // внутренний | inner
    private class A {

    }

    // вложенным | nested
    private static class B {

    }

    private void m1() {
        System.out.println("m1 execution");
    }

    private static void m2() {

    }

}
