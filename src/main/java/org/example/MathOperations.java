package org.example;

public class MathOperations {
    public static double performOperation(double a, double b, Operation operation) {
        return operation.calculate(a, b);
    }

    @FunctionalInterface
    public interface Operation {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation subtract = (x, y) -> x - y;
        Operation divide = (x, y) -> x / y;

        double result = performOperation(5, 3, add);
        System.out.println("Addition: " + result);

        result = performOperation(10, 4, subtract);
        System.out.println("Subtraction: " + result);

        result = performOperation(12, 3, divide);
        System.out.println("Division: " + result);
    }
}