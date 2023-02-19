package com.javarush.task.pro.task13.task1310;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.println("Средний балл группы: " + getAverageMark1());
        System.out.println("Средний балл группы: " + getAverageMark2());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        Set<String> names = grades.keySet();

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static Double getAverageMark1() {
        Set<String> keys = grades.keySet();
        double averageMark = 0d;

        for (String key : keys) {
            averageMark = averageMark + grades.get(key);
        }
        return averageMark / keys.size();
    }

    public static Double getAverageMark2() {
        Collection<Double> averMarks = grades.values();
        double averageMark = 0d;

        for (Double averMark : averMarks) {
            averageMark += averMark;
        }

        return averageMark / grades.size();
    }
}
