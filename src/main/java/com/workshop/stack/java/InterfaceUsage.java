package com.workshop.stack.java;

interface InterfaceOperations {
    int abstractMethod1(int a, int b);
    int abstractMethod2(int a, int b);

    default void defaultMethod1() {
        System.out.println("Default Method 1");
    }

    default void defaultMethod2() {
        System.out.println("Default Method 2");
    }

    static void staticMethod1() {
        System.out.println("Static Method 2");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }
}

public class InterfaceUsage implements InterfaceOperations{
    public static void main(String[] args) {
    }

    @Override
    public int abstractMethod1(int a, int b) {
        return 1;
    }

    @Override
    public int abstractMethod2(int a, int b) {
        return 2;
    }

}