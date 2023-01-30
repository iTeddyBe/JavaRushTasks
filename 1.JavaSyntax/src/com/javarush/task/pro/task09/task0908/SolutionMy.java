package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class SolutionMy {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexResult = "";
        if (binaryNumber == null || binaryNumber.equals("")) {
            return "";
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            if ((binaryNumber.charAt(i) != '0') && (binaryNumber.charAt(i) != '1')) {
                return "";
            }
        }


        while (binaryNumber.length() > 0) {
            String binaryPart4 = "";
            if (binaryNumber.length() >= 4) {
                binaryPart4 = binaryNumber.substring(binaryNumber.length() - 4, binaryNumber.length());
                binaryNumber = binaryNumber.substring(0, binaryNumber.length() - 4);
            } else {
                binaryPart4 = binaryNumber;

                for (int i = 0; i < 4 - binaryNumber.length(); i++) {
                        binaryPart4 = "0" + binaryPart4;
                    }
                binaryNumber = "";

            }

            String hexSymbol = "";

            switch (binaryPart4) {
                case "0000": hexSymbol = "0"; break;
                case "0001": hexSymbol = "1"; break;
                case "0010": hexSymbol = "2"; break;
                case "0011": hexSymbol = "3"; break;
                case "0100": hexSymbol = "4"; break;
                case "0101": hexSymbol = "5"; break;
                case "0110": hexSymbol = "6"; break;
                case "0111": hexSymbol = "7"; break;
                case "1000": hexSymbol = "8"; break;
                case "1001": hexSymbol = "9"; break;
                case "1010": hexSymbol = "a"; break;
                case "1011": hexSymbol = "b"; break;
                case "1100": hexSymbol = "c"; break;
                case "1101": hexSymbol = "d"; break;
                case "1110": hexSymbol = "e"; break;
                case "1111": hexSymbol = "f"; break;
            }

            hexResult = hexSymbol + hexResult;

            //System.out.println(binaryPart4);
            //System.out.println(hexResult);
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
