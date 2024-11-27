package com.workshop.stack.java;

import java.util.function.*;

/**
 * Functional Interface is an interface that contains exactly one abstract method.
 * Exactly one abstract method (mandatory).
 * Any number of default methods (optional).
 * Any number of static methods (optional).
 * <p>
 * The @FunctionalInterface annotation can be used to explicitly mark an interface as functional.
 * This annotation is optional but helps catch errors if the interface accidentally has more than one abstract method.
 */
@FunctionalInterface
interface Calculator {

    /**
     * We can create only One abstract Method inside Functional Interface
     */
    int calculate(int a, int b);

    /**
     *  We can create Multiple default Methods inside Functional Interface
     */
    default void defaultCalculate(int a, int b) {
        int result = calculate(a, b);
        System.out.println("[Default Method] : " + result);
    }

    /**
     *  We can create Multiple static Methods inside Functional Interface
     */
    static void staticCalculate(int a, int b){
        System.out.println("[Static Method] : " + (a + b));
    }
}

public class FunctionalInterfaceUsage {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;  // Implement FI using Lambda Expression
        Calculator sum = Integer::sum;     // Implement FI using Method Reference

        System.out.println("[Abstract Method] : " + add.calculate(5, 3)); // Invoking Abstract Method
        sum.defaultCalculate(5,3);       // Invoking Default Method
        Calculator.staticCalculate(5,3); // Invoking Static Method

        predicateInterface();

        consumerInterface();

        supplierInterface();

        functionInterface();

        biFunctionalInterface();

        runnableInterface();
    }

    /**
     * Usage of Predicate Interface
     * @see Predicate
     */
    private static void predicateInterface() {
        Predicate<String> predicate = s -> s.contains("s");
        System.out.println("simple contains 's' :" + predicate.test("simple"));
        System.out.println("hard contains 's' :" + predicate.test("hard"));
    }

    /**
     * Usage of Consumer Interface
     * @see Consumer
     */
    private static void consumerInterface() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello, Functional Interface!");
    }

    /**
     * Usage of Supplier Interface
     * @see Supplier
     */
    private static void supplierInterface() {
        Supplier supplier = Math::random;
        System.out.println(supplier.get());
    }

    /**
     * Usage of Function Interface
     * @see Function
     */
    private static void functionInterface() {
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hello"));
    }

    /**
     * Usage of Bi-Funcation Interface
     * @see BiFunction
     */
    private static void biFunctionalInterface() {
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        System.out.println(biFunction.apply(5, 10));
    }

    /**
     * Usage of Runnable Interface
     * @see Runnable
     */
    private static void runnableInterface() {
        Runnable runnable = () -> System.out.println("Runnable");
        runnable.run();
    }
}