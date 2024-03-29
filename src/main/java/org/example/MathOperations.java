package org.example;

import java.util.ArrayList;
import java.util.List;
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

        System.out.println("Transformed to Doubles:");
        Stream<Double> doubleStream = Stream.of(playlist)
                .map(number -> number.value);

        List<Double> doubleList = new ArrayList<>();
        doubleStream.forEach(doubleValue -> doubleList.add(doubleValue));

        System.out.println(doubleList);
    }
}