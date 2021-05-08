package ru.job4j.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortSecnd() {
        int[] data = new int[]{8, 2, 5, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 3, 5, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThreeth() {
        int[] data = new int[]{22, 33, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{11, 22, 33};
        Assert.assertArrayEquals(expected, result);
    }
}
