package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        // === (1) === Simple Variant

        String[] temp = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

        // === (2) === Optimized Variant
/*
        int lastNullCell = 1;
        for (int i = 0; i < array.length; i++) {
            if (lastNullCell == array.length)
                break;
            if (array[i] == null) {
                if (i >= lastNullCell) lastNullCell = i + 1;
                for (int j = lastNullCell; j < array.length; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        lastNullCell = j + 1;
                        break;
                    }

                }
            }
        }
        */
    }
}
