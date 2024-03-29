package org.example;

interface Consumer<T> {
    void accept(T t);
}

public class MathOperations {

    public static void main(String[] args) {
        Number[] playlist = { new Number(1.2), new Number(3.5), new Number(5.0) };

        System.out.println("Using Class object:");
        for (Number number : playlist) {
            number.print();
        }

        System.out.println("\nUsing Anonymous Class:");
        for (Number number : playlist) {
            number.forEach(new Consumer<Number>() {
                @Override
                public void accept(Number number) {
                    System.out.println(number.value);
                }
            });
        }

        System.out.println("\nUsing Lambda Expression:");
        for (Number number : playlist) {
            number.forEach(num -> System.out.println(num.value));
        }
    }
}