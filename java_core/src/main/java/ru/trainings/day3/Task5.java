package ru.trainings.day3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Дано число, определить кол-во его цифр (разрядов)
        // 34 -> 2
        // 12345  -> 5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Integer.parseInt(scanner.next());
        int t = n;

        int counter = 0;

        while (t != 0) {
            t = t / 10;
            counter +=1;
        }

        System.out.println("В числе " + n + " " + counter + "цифр");

    }
}
