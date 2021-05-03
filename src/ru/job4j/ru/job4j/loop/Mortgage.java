package ru.job4j.ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount;
        while (debt >= 0) {
            debt = debt + amount * percent / 100 - salary;
            year++;
        }
        return year;
    }
}