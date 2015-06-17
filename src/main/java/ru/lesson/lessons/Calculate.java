package ru.lesson.lessons;

/**
 * Класс для вычисления суммы двух чисел. Числа берутся из входящего массива.
 */
public class Calculate {
    public static void main(String[] arg) {
       System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int sum=first+second;
        System.out.println("Sum : "+sum);
    }
}