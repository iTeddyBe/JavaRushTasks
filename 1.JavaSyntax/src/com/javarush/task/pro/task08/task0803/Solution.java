package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minInt = ints[0];
        for (int i = 1; i < ints.length; i++) {
            minInt = Math.min(minInt, ints[i]);
        }
        return minInt;
    }

    public static int[] getArrayOfTenElements() {
        Scanner input = new Scanner(System.in);
        //Scanner input = new Scanner("1 -2 3 4 5 -6 7 8 9 1");
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}
