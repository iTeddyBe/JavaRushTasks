package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class SolutionMy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNum1 = Integer.MAX_VALUE;
        int minNum2 = Integer.MAX_VALUE;

        while (input.hasNextInt()) {
            int x = input.nextInt();
            if (x < minNum1) {
                minNum2 = minNum1;
                minNum1 = x;
            } else if (x > minNum1 && x < minNum2) {
                minNum2 = x;
            }
            System.out.println("minNum1=" + minNum1 + " minNum2=" + minNum2);
        }
        if (minNum2 == Integer.MAX_VALUE) {
            System.out.println("Введено недостаточно чисел (меньше 2-ух).");
        } else {
            System.out.println(minNum2);
        }
    }
}