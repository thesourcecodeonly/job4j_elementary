package ru.job4j.condition.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        for (int i = number; i >= 1; i--) {
            if (number == 1 || number % 2 == 0 || number % 3 == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
