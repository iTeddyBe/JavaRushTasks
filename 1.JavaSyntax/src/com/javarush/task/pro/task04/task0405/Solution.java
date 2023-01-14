package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        int weight = 0;
        String s = "";
        
        while (height < 10) {
            while (weight < 20) {
                if ((height > 0 && height < 9) && (weight >0 && weight <19)) {
                    s = " ";
                } else s = "Б";
                System.out.print(s);
                weight++;
            }
            System.out.println();
            weight = 0;
            height++;
        }

    }
}