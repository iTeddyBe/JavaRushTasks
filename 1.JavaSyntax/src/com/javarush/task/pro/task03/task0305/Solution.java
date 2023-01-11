package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int digit1 = console.nextInt();
        int digit2 = console.nextInt();
        int digit3 = console.nextInt();
        
        if (digit1 == digit2 && digit2 == digit3) {
            System.out.println(digit1 + " " + digit2 + " " + digit3);
        } else {
            if (digit1 == digit2) {
                System.out.println(digit1 + " " + digit2);
            }
            if (digit2 == digit3) {
                System.out.println(digit2 + " " + digit3);
            }
            if (digit1 == digit3) {
                System.out.println(digit1 + " " + digit3);
            }
            
        }
    }
}
