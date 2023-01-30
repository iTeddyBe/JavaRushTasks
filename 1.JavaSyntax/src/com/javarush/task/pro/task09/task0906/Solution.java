package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryResult = "";
        if (decimalNumber <= 0) {
            return binaryResult;
        }

        while (decimalNumber != 0) {
            binaryResult = (decimalNumber % 2) + binaryResult;
            decimalNumber = decimalNumber / 2;
        }

        return binaryResult;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalResult = 0;
        if (binaryNumber == null) {
            return decimalResult;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - i - 1;
            int digitStr = Character.getNumericValue(binaryNumber.charAt(index));
            decimalResult = decimalResult + digitStr * (int) Math.pow(2, i);
        }
        return decimalResult;
    }
}
