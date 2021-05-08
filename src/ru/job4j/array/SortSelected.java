package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int minIndex = FindLoop.indexOfDiapason(data, min, 0, data.length - 1);
            int temp = data[minIndex];
            data[minIndex] = data[index];
            data[index] = temp;
        }
        return data;
    }
}