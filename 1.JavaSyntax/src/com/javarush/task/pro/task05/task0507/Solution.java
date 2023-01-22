package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(console.nextLine());
        }

        int maxArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }

        System.out.println(maxArray);
    }
}
