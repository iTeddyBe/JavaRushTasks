package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        strings = new String[6];
//        strings = new String[] {"Hello", "Hello", "World", "Java", "Tasks", "World"};
        for (int i = 0; i < 6; i++) {
            strings[i] = input.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }

                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }

}

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
