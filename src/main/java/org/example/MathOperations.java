package org.example;

interface Consumer<T> {
    void accept(T t);
}

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

public class MathOperations {

    public static void main(String[] args) {
        Number[] playlist = { new Number(1.2), new Number(3.5), new Number(5.0), new Number(2.0) };

        Predicate<Number> isEven = number -> number.value % 2 == 0;

        System.out.println("Even Numbers:");
        for (Number number : playlist) {
            if (isEven.test(number)) {
                number.print();
            }
        }
    }
}