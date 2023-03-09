package com.javarush.task.pro.task14.task1409;

/* 
Пропускаем сквозь себя
*/

public class Solution {

    private static Exception RuntimeException;

    public static void main(String[] args)  throws Exception {
        generateLuckyNumber();
        //throw new Exception();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
