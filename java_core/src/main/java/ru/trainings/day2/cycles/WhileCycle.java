package ru.trainings.day2.cycles;

import java.util.Random;

public class WhileCycle {
    public static void main(String[] args) {

//    используется, когда изначально непонятно, сколько раз этот цикл должен выполнится вообще (мб и ни разу)
//    while (true) {
//        System.out.println("Бесконечно");
//    }
        Random random = new Random();
        int value = random.nextInt(1,7);
        System.out.println("Выпало " + value);

        while (value != 5) {
            value = random.nextInt(1,7);
            System.out.println("Выпало " + value);
        }

    }
}
