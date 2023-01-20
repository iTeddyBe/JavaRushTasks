package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countCola = input.nextInt();
        int countMans = input.nextInt();

        double num = countCola * 1.0 / countMans;

        System.out.println(num);
    }
}