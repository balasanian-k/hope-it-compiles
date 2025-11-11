package ru.trainings.day2.operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели (1-7): ");
        String day = scanner.next();

        switch (day) {
            case "Monday":
                System.out.println("Пндлн");
                break;
            case "Tuesday":
                System.out.println("Втрнк");
                break;
            case "Wednesday":
                System.out.println("Срд");
                break;
            default:
                System.out.println("Выходноооой");
        }

    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели (1-7): ");
        int day = Integer.parseInt(scanner.next());

        if (day < 1 || day > 7) return;

//        if (day == 1)
//            System.out.println("Понедельник");
//        if (day == 3)
//            System.out.println("WEDNESDAY");
//        else if (day == 6 || day ==7)
//            System.out.println("Выходноооой");

//        ограничение - могут быть типы данных: int, String, enum
//        кл.сл. default - аналог else в if
//        если нет break - код выполняется далее до конца
        switch (day) {
            case 1:
                System.out.println("Понедельник день тяжелый");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            default:
                System.out.println("Выходноооой");
        }

        System.out.println("Thats right!");

    }
}
