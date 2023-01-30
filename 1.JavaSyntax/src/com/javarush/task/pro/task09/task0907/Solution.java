package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexResult = "";
        if (decimalNumber <= 0) {
            return hexResult;
        }
        while (decimalNumber != 0) {
            hexResult = HEX.charAt(decimalNumber % 16) + hexResult;
            decimalNumber = decimalNumber / 16;
        }

        return hexResult;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null) {
            return 0;
        }

        int decimalResult = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            int hexIndex = HEX.indexOf(hexNumber.charAt(i));
            decimalResult = 16 * decimalResult + hexIndex;
        }
        return decimalResult;
    }
}
