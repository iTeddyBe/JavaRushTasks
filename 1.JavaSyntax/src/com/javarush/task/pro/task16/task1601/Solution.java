package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    //static Date birthDate = new Date("Jan 01 12:00:00 1990");
    static Date birthDate = new Date(101, Calendar.JANUARY, 12); // == 12.01.2001

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        System.out.println(getDayOfWeek2(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int dayOfWeek = date.getDay();

        String strDayOfWeekRus = switch (dayOfWeek) {
            case 0 -> "Воскресенье";
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            default -> "";
        };

        return "switch : " + strDayOfWeekRus;
    }

    static String getDayOfWeek2(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE MMMM dd YYYY");
        SimpleDateFormat dateFormatDayWeed = new SimpleDateFormat("EEEE");
//        Locale localeRU = new Locale("ru");
        Locale localeRU = Locale.forLanguageTag("ru");
        Calendar calendar = new GregorianCalendar(localeRU);

        calendar.set(Calendar.YEAR, date.getYear());
        calendar.set(Calendar.MONTH, date.getMonth());
        calendar.set(Calendar.DATE, date.getDate());

        System.out.println(calendar);

        System.out.println("Full date SimpleDateFormat : " +dateFormat.format(date));

        String dateStr = new SimpleDateFormat("EEEE", Locale.forLanguageTag("ru")).format(date);


        return "SimpleDateFormat : " + dateFormatDayWeed.format(date);
    }
}
