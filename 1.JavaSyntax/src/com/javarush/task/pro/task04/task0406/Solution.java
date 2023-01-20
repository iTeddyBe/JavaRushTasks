package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1;
        while (true) {
            str1 = console.nextLine();
            if (str1.equals("enough")) {
                break;
            }
            System.out.println(str1);
        }

    }
}