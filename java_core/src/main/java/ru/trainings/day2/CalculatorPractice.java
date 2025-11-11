package ru.trainings.day2;

import java.util.Scanner;

public class CalculatorPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = Integer.parseInt(scanner.next());
        System.out.println("Введите действие (+,-,*,/,!): ");
        String action = scanner.next();
        System.out.println("Введите b: ");
        int b = Integer.parseInt(scanner.next());

//      не работает, тк сравниваются объекты
//      if (action == "+")

//        можно так:
//        action.equals("+")
//
//        но лучше так:
//        if ("+".equals(action))

//          а еще лучше через:

        switch (action) {
            case "+":
                int c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                System.out.println(a + " / " + b + " = " + (1.0 * a / b));
                break;
            case "!":
                System.out.println(a + " ! " + factorial(a));
                break;
            default:
                System.out.println("Это какая-то ерунда: " + action);

        }
    }
    private static int factorial(int a) {
        if (a == 0 || a == 1) return 1;
        return a * factorial(a - 1);
    }


    private static int factorial2(int a) {
        int result = 1;
          for (int i = 2; i <= a; i += 1) {
            result = result * i;
          }
        return result;
    }
}
