package ru.job4j.condition;

public class DivideBySix {

    static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "The original number is divided by 6.";
        } else if (number % 3 == 0) {
            rsl = "The original number is divided by 3, but it is not even.";
        } else if (number % 2 == 0) {
            rsl = "The original number is not divisible by 3, but it is even.";
        } else {
                rsl = "The original number is not divisible by 3 and it is not even.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(DivideBySix.checkNumber(63));
    }
}
