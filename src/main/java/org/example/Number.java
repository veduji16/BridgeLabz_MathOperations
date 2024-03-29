package org.example;

import org.example.Consumer;

class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }

    void print() {
        System.out.println(value);
    }

    void forEach(Consumer<Number> consumer) {
        consumer.accept(this);
    }
}