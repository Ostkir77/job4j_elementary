package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                data[j][i] = (j + 1) * (i + 1);
            }
        }
        return data;
    }
}