package ru.job4j.loop;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > index) {
                min = index;
            }
        }
        return min;
    }
}