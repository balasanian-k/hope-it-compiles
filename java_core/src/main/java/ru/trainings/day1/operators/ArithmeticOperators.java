package ru.trainings.day1.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (1.0 * a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

//        a = a + 1;
//        ИНКРЕМЕНТ
        System.out.println("a = " + a);
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a));
        System.out.println("a = " + a);

//        ДЕКРЕМЕНТ
        System.out.println("a = " + a);
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);
        System.out.println("--a = " + (--a));
        System.out.println("a = " + a);

    }
}
