package ru.job4j.ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }


    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        int rubl = Converter.euroToRuble(3);
        System.out.println("3 euro are " + rubl + " rubls.");
        int rubls = Converter.dollarToRuble(2);
        System.out.println("2 dollars are " + rubls + " rubls.");
    }
}
