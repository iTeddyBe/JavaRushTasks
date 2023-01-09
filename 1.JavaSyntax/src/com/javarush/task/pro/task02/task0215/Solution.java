package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard_in = new Scanner(System.in);

        int digit1 = keyboard_in.nextInt();
        int digit2 = keyboard_in.nextInt();
        int digit3 = keyboard_in.nextInt();

        System.out.println((digit1 + digit2 + digit3) / 3);
    }
}
