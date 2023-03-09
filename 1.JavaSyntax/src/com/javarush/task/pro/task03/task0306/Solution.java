package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int side1 = console.nextInt();
        int side2 = console.nextInt();
        int side3 = console.nextInt();
        
        if ((side1 >= side2 + side3) || (side2 >= side1 + side3) || (side3 >= side1 + side2)) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        } else {
            System.out.println(TRIANGLE_EXISTS);
        }    
    }

}
