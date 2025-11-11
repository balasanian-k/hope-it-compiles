package ru.trainings.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Дано 2 числа. Найти среднее арифметическое (a + b) / 2

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите а: ");
//        double a = Double.parseDouble(scanner.next());
//        System.out.println("Введите b: ");
//        double b = Double.parseDouble(scanner.next());
//
//        double r = (a + b) / 2;
//        System.out.println("Cреднее арифметическое: " + r);

//        усложенение: как этот алгоритм распространить на неизвестное кол-во чисел
//        a1, a2....an -> (a1, a2....an) / n

        Scanner scanner = new Scanner(System.in);
        String input = "";
        double sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Введите число: ");
            input = scanner.next();
            if("stop".equals(input)) {  //прекращаем ввод по стоп слову. пустая строка в его качестве не пройдет - особенность работы сканнера
                break;
            }
            double a = Double.parseDouble(input);
            sum += a;
            counter +=1;
        }

        double r = sum / counter;
        System.out.println("Cреднее арифметическое: " + r);

    }
}
