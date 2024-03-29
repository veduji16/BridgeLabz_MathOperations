package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MathOperations {

    interface Consumer<T> {
        void accept(T t);
    }

    @FunctionalInterface
    interface Predicate<T> {
        boolean test(T t);
    }

    public static void main(String[] args) {
        Number[] playlist = { new Number(1.2), new Number(3.5), new Number(5.0), new Number(2.0) };

        System.out.println("Transformed to Doubles:");
        List<Double> doubleList = Stream.of(playlist)
                .map(number -> number.value)
                .collect(Collectors.toList());

        System.out.println(doubleList);

        System.out.println("\nUsing Stream - Even Numbers (Transformed):");
        Predicate<Double> isEven = number -> number % 2 == 0;
        List<Double> evenDoubleList = Stream.of(playlist)
                .map(number -> number.value)
                .filter(isEven::test)
                .collect(Collectors.toList());

        System.out.println(evenDoubleList);
    }
}
