package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int minNum = Integer.MAX_VALUE;
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {
            int x = console.nextInt();
            //System.out.println(x);
            //minNum = (x < minNum) ? x :minNum;
            minNum = Math.min(x, minNum);
        }

        System.out.println(minNum);

    }
}