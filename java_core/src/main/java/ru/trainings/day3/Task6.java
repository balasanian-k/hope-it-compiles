package ru.trainings.day3;

public class Task6 {
    public static void main(String[] args) {
        // PI/4 = 1 - 1/3 + 1/5 + 1/7...
        // Найти PI

        //tip: входных данных как таковых нет, есть формула
        //выходные данные - PI

        double pi = 1;
        double oldPi = 1;
        double n = 1;
        double sign = 1;
        double delta = 0.0000001;


//        for (int i = 0; i < 10000; i++) {
//            n = n + 2;
//            sign *= -1;
//            pi += sign / n;
//        }

        while (true) {
            n = n + 2;
            sign *= -1;
            pi += sign / n;

            if (Math.abs(oldPi - pi) < delta) break;

            oldPi = pi;
        }

        pi *= 4;

        System.out.println("PI =  " + pi);

        // жесть какая
    }
}
