package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumNumbersFromZeroToTenThenFiftyFive() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromThreeToEightThenThirtyThree() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNotEvenNumbersFromZeroToTenThenTwentyFive() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByNotEven(start, finish);
        int expected = 25;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNotEvenNumbersFromThreeToEightThenFiveTeen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByNotEven(start, finish);
        int expected = 15;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNotEvenNumbersFromOneToOneThenOne() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByNotEven(start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}