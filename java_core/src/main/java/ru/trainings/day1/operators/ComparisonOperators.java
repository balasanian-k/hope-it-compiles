package ru.trainings.day1.operators;

public class ComparisonOperators {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 = " + b1 + ", b2 = " + b2);

        int a = 11;
        int b = 6;
        boolean result = equals(a, b);
        System.out.println(a + " == " + b + "? " + result);
        System.out.println(a + " == " + a + "? " + equals(a, a));

        System.out.println(a + " != " + b + "? " + notEquals(a, b));
        System.out.println(a + " != " + a + "? " + notEquals(a, a));

        System.out.println(a + " >= " + b + "? " + greaterOrEqual(a, b));
        System.out.println(b + " >= " + a + "? " + greaterOrEqual(b, a));
        System.out.println(a + " >= " + a + "? " + greaterOrEqual(a, a));
    }

    public static boolean equals(int a, int b) {
        return a==b;
    }

    public static boolean notEquals(int a, int b) {
        return a != b;
    }

    public static boolean greaterOrEqual(int a, int b) {
        return a >= b;
    }


}
