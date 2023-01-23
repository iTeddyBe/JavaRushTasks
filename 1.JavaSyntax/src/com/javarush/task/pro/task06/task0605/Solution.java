package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] arrayTmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayTmp[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayTmp[i];
        }
        // === Код ниже - передается ссылка на массив, и хотя мы присвоили ссылке ссылку - на выходе ссылка
        // не изменилась (ссылка на аргумент не меняется)
//        array = arrayTmp;
//        System.out.println("===");
//        printArray(array);
//        System.out.println("===");
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
