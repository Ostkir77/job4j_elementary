package ru.job4j.ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            result = data[index] == data[data.length - 1];
                }
        return result;
    }
}