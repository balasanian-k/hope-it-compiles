package ru.trainings.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Дано число, выснить, является ли оно простым (эт число, которое без остатка(!) делится только на 1 и само себя).
//        Простое число — это натуральное число больше 1, которое имеет только два натуральных делителя: 1 и само себя.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = Integer.parseInt(scanner.next());

        int divisor = a / 2 + 1;

        do {
            divisor -= 1;
        } while (a % divisor != 0);

         if (divisor == 1) {
             System.out.println("Это простое число");
         } else {
             System.out.println("Это число не простое (золотое)");
         }

    }
}
