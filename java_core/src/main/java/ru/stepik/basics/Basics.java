package ru.stepik.basics;

import java.util.Scanner;

public class Basics {
      public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите выражение в формате: число оператор число (например: 5 + 3): ");
            String input = scanner.nextLine();

            String[] inputValues = input.split(" ");
            int x = Integer.parseInt(inputValues[0]);
            String op = inputValues[1];
            int y = Integer.parseInt(inputValues[2]);
            int result = 0;

            if ("+".equals(op)) {
                result = x + y;
            } else if ("-".equals(op)) {
                result = x - y;
            } else if ("*".equals(op)) {
                result = x * y;
            } else if ("/".equals(op)) {
                result = x / y;
            }

            System.out.println(result);

            scanner.close();
        }
}

//        когда пишем в if (op == "+") - сравнивает по ссылке (неправильно)
//        когда - op.equals("+"), то по значению








