package ru.trainings.day1.operators;

public class BitwiseOperators {
      public static void main(String[] args) {
         int a = 11;
         int b = 6;

//         бит
//         байт
//         килобайт

//    этот кошмар я не пойму никогда
//         int monday = 1;  //0001
//         int tuesday = 2; //0010
//         int wednesday = 3; //0100


         System.out.println(a + " & " + b + " = " + (a & b));
         System.out.println(a + " | " + b + " = " + (a | b));
         System.out.println(a + " ^ " + b + " = " + (a ^ b));
         System.out.println("~" + a + " = " + (~a));

         System.out.println(a + ", " + b);

         int c = a;

         a = b;
         b = c;

         System.out.println(a + ", " + b); // 6, 11

         a = a ^ b;
         b = a ^ b;
         a = a ^ b;

         System.out.println(a + ", " + b);

      }
}

