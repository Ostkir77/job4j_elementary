package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to20then3() {
        int expected = 3;
        int x1 = 5;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to41then4() {
        double expected = 4.12;
        int x1 = 3;
        int y1 = 5;
        int x2 = 4;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to43then2() {
        double expected = 3.6;
        int x1 = 1;
        int y1 = 5;
        int x2 = 4;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
