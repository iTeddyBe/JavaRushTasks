package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int temper = console.nextInt();

        if (temper < 0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }
}
