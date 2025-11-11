package ru.trainings.day2.cycles;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i ++) {
            for (int j = 1; j <= 5; j++){
                if (j==3) continue; // управляющее слово -> прерывает текущую операцию цикла и немедленно переходит к следующей
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
            if (i == 4) break; // немедленный выход из текущего цикла, не дожидаясь его завершения
        }
    }

    // оба слова работают внутри только того цикла, в котором используются
}
