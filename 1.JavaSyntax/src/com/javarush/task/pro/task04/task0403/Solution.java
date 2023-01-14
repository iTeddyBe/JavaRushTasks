package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (console.hasNextInt()) {
                sum = sum + console.nextInt();
            } else if (console.nextLine().equals("ENTER")) {
                isExit = true;
            }
        }
        System.out.println(sum);

    }
}