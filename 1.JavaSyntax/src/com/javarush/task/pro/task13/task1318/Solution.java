package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int indexNextMonth = month.ordinal() + 1;
        if (indexNextMonth > Month.values().length - 1) {
            indexNextMonth = 0;
        }
        return Month.values()[indexNextMonth];

//        int indexNextMonth = (month == Month.DECEMBER) ? 0 : month.ordinal() + 1;
//        return Month.values()[indexNextMonth];

        //return Month.values()[(month.ordinal() + 1) % 12];
    }
}
