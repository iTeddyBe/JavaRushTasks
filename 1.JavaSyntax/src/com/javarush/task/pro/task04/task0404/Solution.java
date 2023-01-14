package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        int weight = 0;
        while (height < 5) {
            while (weight < 10) {
                System.out.print("Q");
                weight++;
            }
            System.out.println();
            weight = 0;
            height++;
        }

    }
}