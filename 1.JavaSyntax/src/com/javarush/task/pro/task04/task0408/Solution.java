package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;

        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0) {
                maxNum = Math.max(x, maxNum);
            }
        }

        System.out.println(maxNum);

    }
}