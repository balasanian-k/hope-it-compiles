package ru.trainings.day2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.UUID;

public class WorkWithDoubles {
    public static void main(String[] args) {

        BigDecimal bd = BigDecimal.ONE.divide(BigDecimal.valueOf(3), MathContext.DECIMAL128);
        System.out.println(bd);

        bd = BigDecimal.valueOf(2).pow(500);
        System.out.println(bd);
        System.out.println(UUID.randomUUID());
    }

    public static void main1(String[] args) {
        float f = 1.0F / 3;
        double d = 1.0 / 3;
        System.out.printf("%1.20f\n", f);
        System.out.printf("%1.20f\n", d);

        double d2 = 0.33333333;

//  Нельзя, т.к. дробные вычисления не являются точными
//  if (d == d2) {}
        double delta = 0.000001;
//  сравнение дробных чисел:
        if (Math.abs(d - d2) < delta) {
            System.out.println("double values are equal");
        } else {
            System.out.println("not equal values");
        }

    }

}