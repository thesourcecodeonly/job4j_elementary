package ru.job4j.condition.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = finish; number > 1; number--) {
            if (CheckPrimeNumber.check(number) || number == 2 || number == 3) {
                count++;
            }
        }
        return count;
    }
}
