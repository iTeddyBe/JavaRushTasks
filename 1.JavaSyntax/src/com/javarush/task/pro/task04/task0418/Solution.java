package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double glass = 0.5;
        boolean boolInput = input.nextBoolean();
        int result;

        if (boolInput) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }

        System.out.println(result);

    }
}