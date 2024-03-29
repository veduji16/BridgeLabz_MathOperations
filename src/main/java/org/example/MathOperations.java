package org.example;

public class MathOperations {

    public static double performOperation(double a, double b, Operation operation) {
        return operation.calculate(a, b);
    }

    @FunctionalInterface
    public interface Operation {
        double calculate(double a, double b);
    }

    public static void showResult(String operationName, double result) {
        System.out.println(operationName + ": " + result);
    }

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation subtract = (x, y) -> x - y;
        Operation divide = (x, y) -> y != 0 ? x / y : Double.NaN;

        showResult("Addition", performOperation(5, 3, add));
        showResult("Subtraction", performOperation(10, 4, subtract));
        showResult("Division", performOperation(12, 3, divide));
    }
}
