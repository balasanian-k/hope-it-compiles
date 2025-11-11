package ru.trainings.day2.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;

//        same a = a + b
        a+=b;
        System.out.println("a = " + a);

//        same a = a >> b
        a>>=2;
        System.out.println("a = " + a);

//        same a = a % b
        a %=3;
        System.out.println("a = " + a);

//        same a = a + 1, a++
        a+=1;
        System.out.println("a = " + a);

    }
}
