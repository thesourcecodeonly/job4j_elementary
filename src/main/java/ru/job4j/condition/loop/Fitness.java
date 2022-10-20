package ru.job4j.condition.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan > nik) {
            return 0;
        } else if (ivan == nik) {
            return 1;
        }
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
