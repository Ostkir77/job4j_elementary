package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

        @Test
        public void whenExistTwoo() {
            double ab = 1.0;
            double ac = 1.0;
            double bc = 3.0;
            boolean result = Triangle.exist(ab, ac, bc);
            Assert.assertFalse(result);
        }

        @Test
        public void whenExist() {
            double ab = 3.0;
            double ac = 2.0;
            double bc = 4.0;
            boolean result = Triangle.exist(ab, ac, bc);
            Assert.assertTrue(result);
        }
    }

