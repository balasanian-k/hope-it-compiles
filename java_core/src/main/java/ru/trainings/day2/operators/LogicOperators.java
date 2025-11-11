package ru.trainings.day2.operators;

public class LogicOperators {
    public static void main(String[] args) {

        System.out.println("isTrue() && isTrue(): " + (isTrue() && isTrue()));
        System.out.println("isTrue() && isFalse(): " + (isTrue() && isFalse()));


        System.out.println("isFalse() || isTrue(): " + (isFalse() || isTrue()));
        System.out.println("isFalse() || isFalse(): " + (isFalse() || isFalse()));


        System.out.println("isFalse() && isTrue(): " + (isFalse() && isTrue()));
        System.out.println("isTrue() || isFalse(): " + (isTrue() || isFalse()));
        System.out.println("!isTrue() = " + (!isTrue()));

    }

    public static boolean isTrue() {
        System.out.println("Return true");
        return true;

    }

    public static boolean isFalse() {
        System.out.println("Return false");
        return false;

    }
}


