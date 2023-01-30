package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

import java.util.Arrays;

public class SolutionMyArray {

    public static void main(String[] args) {
        String binaryNumber = "101100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return "";
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            char c = binaryNumber.charAt(i);
            if ((c != '0') && (c != '1')) {
                return "";
            }
        }

        String hexResult = "";

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        String[][] binHexTable = {
                {"0000", "0"}, {"0001", "1"}, {"0010", "2"}, {"0011", "3"}, {"0100", "4"}, {"0101", "5"}, {"0110", "6"}, {"0111", "7"},
                {"1000", "8"}, {"1001", "9"}, {"1010", "a"}, {"1011", "b"}, {"1100", "c"}, {"1101", "d"}, {"1110", "e"}, {"1111", "f"}
        };
        System.out.println(Arrays.deepToString(binHexTable));

        while (binaryNumber.length() > 0) {
            String binaryPart4;
            int strLength = binaryNumber.length();
            binaryPart4 = binaryNumber.substring(strLength - 4, strLength);

            for (int i = 0; i < binHexTable.length; i++) {
                if (binaryPart4.equals(binHexTable[i][0])) {
                    String charHex = binHexTable[i][1];
                    hexResult = charHex + hexResult;
                    break;
                }
            }
            binaryNumber = binaryNumber.substring(0, binaryNumber.length() - 4);
        }
        return hexResult;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null) {
            return "";
        }

        String constHex = "0123456789abcdef";

        for (int i = 0; i < hexNumber.length(); i++) {
            String c = Character.toString(hexNumber.charAt(i));
            if (constHex.contains(c) == false) {
                return "";
            };
        }


        String binaryResult = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String charStr = Character.toString(hexNumber.charAt(i));
            String binaryPart = "";

            switch (charStr) {
                case "0": binaryPart = "0000"; break;
                case "1": binaryPart = "0001"; break;
                case "2": binaryPart = "0010"; break;
                case "3": binaryPart = "0011"; break;
                case "4": binaryPart = "0100"; break;
                case "5": binaryPart = "0101"; break;
                case "6": binaryPart = "0110"; break;
                case "7": binaryPart = "0111"; break;
                case "8": binaryPart = "1000"; break;
                case "9": binaryPart = "1001"; break;
                case "a": binaryPart = "1010"; break;
                case "b": binaryPart = "1011"; break;
                case "c": binaryPart = "1100"; break;
                case "d": binaryPart = "1101"; break;
                case "e": binaryPart = "1110"; break;
                case "f": binaryPart = "1111"; break;
            }

            binaryResult = binaryResult + binaryPart;

            //System.out.println(charStr);
        }
        return binaryResult;
    }
}
