package ru.job4j.ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", I am " + age);
    }

    public static void main(String[] args) {

        ArgMethod.hello("Petr Arsentev", 33);

    }
}