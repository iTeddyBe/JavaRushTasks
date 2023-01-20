package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wind_speed_m_sec = input.nextInt();

        int wind_speed_km_hour = (int) Math.round(wind_speed_m_sec * 3.6);

        System.out.println(wind_speed_km_hour);

    }
}