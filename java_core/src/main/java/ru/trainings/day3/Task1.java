package ru.trainings.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Даны 3 числа - длины. Проверить, можно ли из сторон такой длины сделать треугольник.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите а: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Введите b: ");
        int b = Integer.parseInt(scanner.next());
        System.out.print("Введите c: ");
        int c = Integer.parseInt(scanner.next());

        //как-то нужно понять, что
//        Сумма любых двух сторон всегда больше третьей стороны (например, \(a+b>c\)).
//        Это условие гарантирует, что из трех отрезков можно построить треугольник.

//        v1
        if (a + b > c && b + c > a && c + a > b){
            System.out.println("Отлично, можно сделать теругольник!");
        } else {
            System.out.println("Non triangle");
        }

//        v2
//        boolean isTriangle = false;
//        if (a + b > c) {
//            if (b + c > a) {
//                if (a + c > b) {
//                    System.out.println("Можно сделать треугольник");
//                    isTriangle = true;
//                }
//            }
//        }
//        if (!isTriangle)
//            System.out.println("Не треугольник");

//        v3 (со сдвигом)
//        boolean isTriangle = true;
//        for(int i = 0; i < 3; i++) {
//            if (a + b < c) {
//                isTriangle = false;
//                break;
//            }
//            int t = c;
//            c = b;
//            b = a;
//            a = t;
//        }
//        if (isTriangle) {
//            System.out.println("Можно сделать треугольник");
//        } else {
//            System.out.println("Не треугольник");
//        }
//        System.out.println("End");



        //не работает
//        if (a + b > c) {
//            if (b + c > a) {
//                if(c + a > b) {
//                    System.out.println("Отлично, можно сделать теругольник!");
//                } else {
//                    System.out.println("Non triangle");
//                }
//            } else {
//                System.out.println("Non triangle");
//            }
//        } else {
//            System.out.println("Non triangle");
//        }



    }
}
