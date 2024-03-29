package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathOperations {

    public static void main(String[] args) {
        Number[] playlist = {new Number(1.2), new Number(3.5), new Number(5.0), new Number(2.0), new Number(8.1)};

        System.out.println("Original Numbers:");
        List<Double> originalList = Arrays.stream(playlist)
                .map(number -> number.value)
                .collect(Collectors.toList());
        System.out.println(originalList);

        List<Double> sortedList = Arrays.stream(playlist)
                .map(number -> number.value)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nSorted Numbers (Ascending Order):");
        System.out.println(sortedList);
    }
}