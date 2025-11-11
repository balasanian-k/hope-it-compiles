package ru.trainings.day2.operators;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        int n = 3;
        String day;

//        if(n == 1) day = "Понедельник";
//        else day = "Не понедельник";

//      Elvis оператор
//      "тело if" = "Понедельник", тело "else" = "Не понедельник"
        day = n == 1 ? "Понедельник" : "Не понедельник";

        System.out.println(day);
    }


    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пжлст число: ");
        int c = Integer.parseInt(scanner.next());

        boolean delitsaNa2 = c % 2 ==0;
        boolean delitsaNa3 = c % 3 ==0;
        boolean delitsaNa5 = c % 5 ==0;

        if (delitsaNa2 && delitsaNa3 && delitsaNa5) {
            System.out.println(c + " делится на 2, 3, 5");
        } else if (delitsaNa2 && delitsaNa3) {
            System.out.println(c + " делится на 2, 3");
        } else {
            System.out.println(c + " НЕ делится на 2, 3");
        }

//        if (c % 2 == 0) {
//            System.out.println(c + " делится на 2");
//        } else if (c % 3 == 0){
//            System.out.println(c + " делится на 3");
//        }
//        else {
//            System.out.println(c + " не делится на 2");
//        }

    }
}
