package com.javarush.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 1
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        String[] strArray = new String[] {"4", "5", "6"};

        System.out.println(list1.toString());
        System.out.println(list2.toString());

        addAll1(list1, "1", "2", "3");
        addAll2(list2, strArray);

        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if (destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }

        Collections.copy(destination, source);

//        for (int i = 0; i < source.size(); i++) {
//            destination.set(i, source.get(i));
//        }
    }

    public static void addAll1(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);

//        for (String string : strings) {
//            list.add(string);
//        }
    }

    public static void addAll2(ArrayList<String> list, String[] strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);

//        for (int i = 0; i < list.size(); i++) {
//            String string = list.get(i);
//            if (string.equals(oldValue)) {
//                list.set(i, newValue);
//            }
//        }
    }
}
