package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenp6k2Square2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp24k5Square20() {
        int expected = 20;
        int p = 24;
        int k = 5;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp18k8Square8() {
        int expected = 8;
        int p = 18;
        int k = 8;
        int out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}