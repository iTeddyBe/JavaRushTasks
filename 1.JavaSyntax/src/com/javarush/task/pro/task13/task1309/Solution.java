package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Max", 12.3d);
        grades.put("Ann", 18.1d);
        grades.put("Sam", 10.3d);
        grades.put("Rom", 14.7d);
        grades.put("Qua", 11.3d);
    }
}
