package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.*;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        //return new Month[] {JANUARY, FEBRUARY, MARCH};
        Month[] array = new Month[3];
        array[0] = values()[11];
        array[1] = values()[0];
        array[2] = values()[1];
        return array;
    }

    public static Month[] getSpringMonths() {
        return Arrays.copyOfRange(values(), 2, 5);
    }

    public static Month[] getSummerMonths() {
        return Arrays.copyOfRange(values(), 5, 8);
    }

    public static Month[] getAutumnMonths() {
        return Arrays.copyOfRange(values(), 8, 11);
    }

}
