package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double deductAndDivision(double first, double second) {
        return deduct(first, second) + division(first, second);
    }

    public static double sumOfAllOperation(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + deduct(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения суммирования и умножения равен: "
                + sumAndMultiply(10, 20));
        System.out.println("Результат сложения вычитания и деления равен: "
                + deductAndDivision(10, 20));
        System.out.println("Результат сложения всех операций равен: "
                + sumOfAllOperation(10, 20));
    }
}
