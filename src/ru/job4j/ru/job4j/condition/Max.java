package ru.job4j.ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int msg = Max.max(33, 11);
        System.out.println(msg);
    }
}
