package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2002, Calendar.MAY, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        System.out.println(getDayOfWeek2(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.forLanguageTag("ru"));
        return dateFormat.format(calendar.getTime());
    }
    static String getDayOfWeek2(Calendar calendar) {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1: return "Воскресенье";
            case 2: return "Понедельник";
            case 3: return "Вторник";
            case 4: return "Среда";
            case 5: return "Четверг";
            case 6: return "Пятница";
            case 7: return "Суббота";
            default: return "";
        }
    }
}
