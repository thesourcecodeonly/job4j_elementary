package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int deduct = money - price;
        while (deduct > 0) {
            if (deduct >= 10) {
                rsl[size] = coins[0];
                deduct -= 10;
                size++;
            }
            if (deduct < 10 && deduct >= 5) {
                rsl[size] = coins[1];
                deduct -= 5;
                size++;
            }
            if (deduct < 5 && deduct >= 2) {
                rsl[size] = coins[2];
                deduct -= 2;
                size++;
            }
            if (deduct == 1) {
                rsl[size] = coins[3];
                deduct -= 1;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}






