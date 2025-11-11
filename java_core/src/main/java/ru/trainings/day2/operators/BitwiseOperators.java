package ru.trainings.day2.operators;

public class BitwiseOperators {
      public static void main(String[] args) {

//      ОПЕРАТОРЫ СДВИГА
        int a = 11;
        System.out.println("a << 1 = " + (a << 1)); // Эквивалентно a * 2^1
        System.out.println("a << 2 = " + (a << 2)); // Эквивалентно a * 2^2
        System.out.println("a >> 1 = " + (a >> 1)); // Эквивалентно a / 2^1
        System.out.println("a >> 2 = " + (a >> 2)); // Эквивалентно a / 2^2
        System.out.println("a >> 4 = " + (a >> 4)); // Всегда 0

        a = -1 * a;

        System.out.println("a = " + a);
        System.out.println("a >>> 1 = " + (a >>> 1));

      }
}


