package org.example;

import java.util.stream.Stream;

interface Consumer<T> {
    void accept(T t);
}

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

public class MathOperations {

    public static void main(String[] args) {
        Number[] playlist = {new Number(1.2), new Number(3.5), new Number(5.0), new Number(2.0)};

        // Create a Stream from the playlist
        System.out.println("Using Stream - All Numbers:");
        Stream<Number> numberStream = Stream.of(playlist);
        numberStream.forEach(Number::print);

        // Filter even numbers using Predicate
        System.out.println("\nUsing Stream - Even Numbers:");
        Predicate<Number> isEven = number -> number.value % 2 == 0;
        numberStream = Stream.of(playlist); // Recreate the stream
        numberStream.filter(isEven::test).forEach(Number::print);
    }
}
