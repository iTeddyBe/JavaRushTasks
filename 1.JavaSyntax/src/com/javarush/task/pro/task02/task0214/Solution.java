package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard_data = new Scanner(System.in);
        String line1 = keyboard_data.nextLine();
        String line2 = keyboard_data.nextLine();
        String line3 = keyboard_data.nextLine();

        System.out.println(line3);
        System.out.println(line2.toUpperCase());
        System.out.println(line1.toLowerCase());

    }
}
