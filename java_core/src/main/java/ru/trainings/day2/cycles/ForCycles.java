package ru.trainings.day2.cycles;

public class ForCycles {
    public static void main(String[] args) {
//        for (1, 2, 3)
//            1 - усл. входа в цикл
//            2 - усл.завершения цикла
//            3 - выполняется на каждой итерации цикла
        for(int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("********************************");

        int i = 5;
        for (i = 5; i > 0; i--) {
            System.out.println("i = " + i);
        }

//        меняем одну и ту же переменную!

        System.out.println("Final i = " + i);
    }
}
