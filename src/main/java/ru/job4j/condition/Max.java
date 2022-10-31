package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int moreRight) {
        return max(left, max(right, moreRight));
    }

    public static int max(int moreLeft, int left, int right, int moreRight) {
        return max(max(moreLeft, left), max(right, moreRight));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 3));
    }
}
