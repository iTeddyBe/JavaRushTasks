package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String stringFromConsole =scanner.nextLine();
        String reverseStringVar0 = new StringBuilder(stringFromConsole).reverse().toString();

        printSomething(reverseStringVar0);
        String result0 = outputStream.toString();
        System.out.println(result0 + " : variant 0 - using imediate StringBuilder.reverse() - without reset()");

        outputStream.reset();
        printSomething(stringFromConsole);

        byte[] arrayByte = outputStream.toByteArray();
        String reverseStringVar1 = reverseMy(arrayByte);

        StringBuilder stringBuilder = new StringBuilder(outputStream.toString());
        String reverseStringVar2 = stringBuilder.reverse().toString();

        // === variant using direct write()
        outputStream.reset();
        outputStream.write(arrayByte, 0, arrayByte.length);
        String result1 = outputStream.toString();
        System.out.println(result1 + " : variant 1 - my - using array reverse and direct write()");

        outputStream.reset();
        printSomething(reverseStringVar1);
        String result2 = outputStream.toString();
        System.out.println(result2 + " : variant 2 - my - using array reverse");

        outputStream.reset();
        printSomething(reverseStringVar2);
        String result3 = outputStream.toString();
        System.out.println(result3 + " : variant 3 - JavaRush - using StringBuilder.reverse()");
    }

    public static void printSomething(String str) {
        stream.print(str);
    }

    private static String reverseMy(byte[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            byte tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return new String(array, 0, array.length);
    }
}