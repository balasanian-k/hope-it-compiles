package ru.trainings.day3;

import java.util.Scanner;

public class Task7SquareEquations {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0
        // D = b^2 - 4ac
        // x(1,2) = (-b +- sqrt(D)) / 2
        // эти слова я в последний раз в школе слышала :<

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = Double.parseDouble(scanner.next());
        System.out.print("Введите b: ");
        double b = Double.parseDouble(scanner.next());
        System.out.print("Введите c: ");

        double c = Double.parseDouble(scanner.next());

        double d = b * b - 4 * a * c;

        if (Math.abs(d) < 0.00001) { //заданная точность
            // 1 корень
            System.out.println("x = " + (-b / 2));
        } else if (d < 0) {
            // Нет корней
            System.out.println("Нет корней");
        } else {
            // 2 корня
            System.out.println("x1 = " + (-b + Math.sqrt(d) / 2));
            System.out.println("x2 = " + (-b - Math.sqrt(d) / 2));

        }
    }
}
