package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant resultMAX = Instant.ofEpochMilli(Long.MAX_VALUE);
        return resultMAX;
    }

    static Instant getMaxFromSeconds() {
        Instant resultMAX = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        System.out.println(resultMAX);
        return resultMAX;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant resultMAX = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
        //System.out.println(Instant.MAX.getNano()); // = 999 999 999
        return resultMAX;
    }
}
