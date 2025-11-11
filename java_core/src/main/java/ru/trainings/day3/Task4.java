package ru.trainings.day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //составить таблицу умножения введенного числа от 1 до 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = Integer.parseInt(scanner.next());

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }



    }
}
