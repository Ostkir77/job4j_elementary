package ru.job4j.ru.job4j.loop;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}