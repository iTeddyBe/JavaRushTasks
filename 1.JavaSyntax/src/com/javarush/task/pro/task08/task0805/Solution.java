package com.javarush.task.pro.task08.task0805;

/* 
Magic 8 ball
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Заработаю ли я себе на BMW? ---> ");
            System.out.println(MagicBall.getPredictionArray());
        }
    }


}
