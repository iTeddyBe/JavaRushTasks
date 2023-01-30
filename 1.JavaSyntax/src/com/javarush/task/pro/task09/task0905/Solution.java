package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalResult = 0;
        if (decimalNumber <= 0)
            return octalResult;
        int i = 0;
        while (decimalNumber != 0) {
            octalResult = (int) (octalResult + (decimalNumber % 8) * Math.pow(10.0, i));
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return octalResult;

    }

    public static int toDecimal(int octalNumber) {
        int decimalResult = 0;
        if (octalNumber <= 0)
            return decimalResult;
        int i = 0;
        while (octalNumber != 0) {
            decimalResult = (int) (decimalResult + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return decimalResult;
    }
}
