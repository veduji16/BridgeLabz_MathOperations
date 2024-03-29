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
        Number[] playlist = {new Number(1.2), new Number(3.5), new Number(5.0), new Number(2.0)};

        System.out.println("Transformed to Doubles with Peek (Demonstration):");
        Stream<Double> doubleStream = Stream.of(playlist)
                .peek(number -> System.out.println("Processing: " + number.value)) // Optional peek for demonstration
                .map(number -> number.value);

        System.out.println("\nFind First Even Number:");
        Predicate<Double> isEven = number -> number % 2 == 0;
        Optional<Double> firstEven = doubleStream.findFirst();

        if (firstEven.isPresent()) {
            System.out.println(firstEven.get());
        } else {
            System.out.println("No even number found.");
        }

        List<Double> evenDoubleList = doubleStream.collect(Collectors.toList());
        System.out.println("\nRemaining Even Numbers (if any):");
        System.out.println(evenDoubleList);
    }
}
