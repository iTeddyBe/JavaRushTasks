package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int number = input.nextInt();
//        do {
//            System.out.println(s);
//            if (number >= 5) {
//                break;
//            }
//            number--;
//        } while (number > 0);
        do {
            System.out.println(s);
            number--;
        } while (number > 0 && number < 4);

    }
}