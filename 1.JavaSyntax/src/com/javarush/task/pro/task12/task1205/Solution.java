package com.javarush.task.pro.task12.task1205;

/* 
Метод деления
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println("My ==========");

        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);

        System.out.println("JavaRush ==========");

        divideJRVarian(1, 0);
        divideJRVarian(-1, 0);
        divideJRVarian(0, 0);
        divideJRVarian(100, 20);
        divideJRVarian(200, 20);
    }

    public static void divide(double a, double b) {
        if ((a > 0 && b == 0)
                || (a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY)
                || (a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY)) {

            System.out.println(Double.POSITIVE_INFINITY);

        } else if ((a < 0 && b == 0)
                || ((a == Double.NEGATIVE_INFINITY) && (b >= 0) && (b != Double.POSITIVE_INFINITY))
                || ((a == Double.POSITIVE_INFINITY) && (b < 0) && (b != Double.NEGATIVE_INFINITY))) {

            System.out.println(Double.NEGATIVE_INFINITY);

        } else if ((a == 0 && b == 0)
                || (a == Double.NaN || b == Double.NaN)
                || (a == Double.POSITIVE_INFINITY && b == Double.POSITIVE_INFINITY)
                || (a == Double.POSITIVE_INFINITY && b == Double.NEGATIVE_INFINITY)
                || (a == Double.NEGATIVE_INFINITY && b == Double.POSITIVE_INFINITY)
                || (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)) {

            System.out.println(Double.NaN);
        } else {
            System.out.println(a / b);
        }
    }

    public static void divideJRVarian(double a, double b) {
        System.out.println(a / b);
    }
}
