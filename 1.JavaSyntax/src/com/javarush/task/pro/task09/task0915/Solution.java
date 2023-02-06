package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokinazer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokinazer.countTokens()];
        int i = 0;
        while (tokinazer.hasMoreTokens()) {
            System.out.println(tokinazer.countTokens() + " - Особенность - при вызове .nextToken() - .countTokens() уменьшается на 1");
            result[i] = tokinazer.nextToken();
            i++;
        }
        return result;
    }
}
