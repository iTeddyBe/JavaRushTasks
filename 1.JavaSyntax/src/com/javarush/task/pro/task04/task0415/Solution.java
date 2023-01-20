package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int radius = input.nextInt();

        int square = (int) (pi * radius * radius);

        System.out.println(square);
    }
}