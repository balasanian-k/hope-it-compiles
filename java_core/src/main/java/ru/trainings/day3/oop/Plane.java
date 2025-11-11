package ru.trainings.day3.oop;

public class Plane {

    int numOfWings;

    String engineType;

    int fuelAmount;

    void takeOff() {
        System.out.println("Взлететь");
    }

    void fly(int distance) {
        System.out.println("Лететь" + distance + "км");
    }

    void land() {
        System.out.println("Приземлиться");
    }
}
