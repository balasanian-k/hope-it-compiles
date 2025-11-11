package ru.trainings.day2.cycles;

public class EnhancedForCycle {
    public static void main(String[] args) {
//        for ( 1 : 2 ), где 1 - переменная, в кот.будут поочередно храниться все элементы второго множества (2) , 2 - некое множество однотипных (!) элементов

        for(String value : args) {
            System.out.println(value);
        }

        System.out.println("Stop");

//        same
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

    }
}

