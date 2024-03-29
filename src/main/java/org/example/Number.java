package org.example;

public class Number {
    double value;

    public Number(double value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

    public void forEach(Consumer<Number> consumer) {
        consumer.accept(this);
    }
}