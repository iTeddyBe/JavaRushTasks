package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        if (console.hasNextInt()) {
            int n = console.nextInt();

            if (n > 0) {
                int[] intArray = new int[n];

                for (int i = 0; i < n; i++) {
                    intArray[i] = console.nextInt();
                }

                if (n % 2 == 1) {
                    for (int i = 0; i < intArray.length; i++) {
                        System.out.println(intArray[i]);
                    }
                } else {
                    for (int i = intArray.length - 1; i >= 0; i--) {
                        System.out.println(intArray[i]);
                    }
                }
            }

        }
    }
}
