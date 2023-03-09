package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {

    public static int min(int value1, int value2) {
        if (value1 < value2) {
            return value1;
        }
        return value2;
    }

    public static int min(int value1, int value2, int value3) {
        int min1 = min(value1, value2);
        return min(min1, value3);
    }

    public static int min(int value1, int value2, int value3, int value4) {
        int min1 = min(value1, value2, value3);
        return min(min1, value4);
    }

    public static int min(int value1, int value2, int value3, int value4, int value5) {
        int min1 = min(value1, value2, value3, value4);
        return min(min1, value5);
    }

    // === MAX - block ==============================================

    public static int max(int value1, int value2) {
        return Math.max(value1, value2);
    }

    public static int max(int value1, int value2, int value3) {
        return max(value3, max(value1, value2));
    }

    public static int max(int value1, int value2, int value3, int value4) {
        return max(value4, max(value1, value2, value3));
    }

    public static int max(int value1, int value2, int value3, int value4, int value5) {
        return max(value5, max(value1, value2, value3, value4));
    }
}
