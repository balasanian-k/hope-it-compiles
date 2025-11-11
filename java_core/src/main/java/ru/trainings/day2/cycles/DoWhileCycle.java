package ru.trainings.day2.cycles;

import java.util.Random;

public class DoWhileCycle {
    public static void main(String[] args) {
        Random random = new Random();
        int value = 0; // явным образом определяем, хоть оно и не пригодится. в Java любые данные этого типа int имеют значение 0

        do {
            value = random.nextInt(1,7);
            System.out.println("Выпало " + value);
        } while (value != 5);
    }
}

// отличие от while - этот цикл выполнится хотя бы один раз