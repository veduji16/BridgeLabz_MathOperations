package org.example;

import java.util.List;
import java.util.Optional;
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
        Number[] playlist = {new Number(1.2), new Number(3.5), new Number(5.0), new Number(2.0), new Number(8.1)};

        System.out.println("Transformed to Doubles:");
        List<Double> doubleList = Stream.of(playlist)
                .map(number -> number.value)
                .collect(Collectors.toList());

        System.out.println(doubleList);

        System.out.println("\nMin and Max Even Numbers:");
        Predicate<Double> isEven = number -> number % 2 == 0;
        Optional<Double> minEven = Stream.of(playlist)
                .map(number -> number.value)
                .filter(isEven::test)
                .min(Double::compareTo);

        Optional<Double> maxEven = Stream.of(playlist)
                .map(number -> number.value)
                .filter(isEven::test)
                .max(Double::compareTo);

        System.out.println("Min Even: " + (minEven.isPresent() ? minEven.get() : "No even number"));
        System.out.println("Max Even: " + (maxEven.isPresent() ? maxEven.get() : "No even number"));

        double sum = Stream.of(playlist)
                .mapToDouble(number -> number.value)
                .sum();
        double average = sum / playlist.length;

        System.out.println("\nSum of all numbers: " + sum);
        System.out.println("Average of all numbers: " + average);

        boolean allEven = Stream.of(playlist)
                .map(number -> number.value)
                .allMatch(isEven::test);

        boolean anyEven = Stream.of(playlist)
                .map(number -> number.value)
                .anyMatch(isEven::test);

        System.out.println("\nAre all numbers even? " + allEven);
        System.out.println("Is at least one number even? " + anyEven);
    }
}
