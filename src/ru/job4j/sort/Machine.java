package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int pocket = money - price;
        while (pocket > 0) {
          for (int index = 0; index < coins.length; index++) {
              if (pocket >= coins[index]) {
                  rsl[size] = coins[index];
                  size++;
                  pocket -= coins[index];
                  break;
              }
          }
        }
        return Arrays.copyOf(rsl, size);
    }
}