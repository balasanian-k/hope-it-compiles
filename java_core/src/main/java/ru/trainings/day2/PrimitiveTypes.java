package ru.trainings.day2;

public class PrimitiveTypes {
    public static void main(String[] args) {

// Логический
        boolean bool = true; // 1 byte

// Целочисленные
        byte b = 1; // 1 byte
        short sh = 2; // 2 byte
        char ch1 = 65; // 2 byte
        char ch2 = 'A';
        int n = 43; // 4 byte
        long l = 4_423_123_654L; // 8 byte

// Дробные, числа с плавающей точкой
        float f1 = 3.14F; // 4 byte
        float f2 = (float) 3.14; // 4 byte
        double d = 2.71; // 8 byte

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println((byte)(b + 127));

        sh = b;        // Допуcтимо
        b = (byte) sh; // Нужно явное приведение типов, т.к. short больше чем byte


        b = (byte) 500;
        System.out.println(b);

    }
}

