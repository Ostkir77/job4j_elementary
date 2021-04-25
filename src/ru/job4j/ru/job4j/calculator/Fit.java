package ru.job4j.ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manheight) {
        double rsl = (manheight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short womanheight) {
        double rsl = (womanheight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manheight = 187;
        double man = Fit.manWeight(manheight);
        System.out.println("Man 187 is " + man);
        short womanheight = 169;
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Woman 169 is " + woman);
    }
}
