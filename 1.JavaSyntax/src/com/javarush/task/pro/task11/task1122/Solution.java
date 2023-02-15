package com.javarush.task.pro.task11.task1122;

/* 
Затенение поля класса
*/

public class Solution {
    public static int salary = 10;

    public static void add(int increase) {
//        int salary = Solution.salary;
        //salary += increase;
    }

    public static void main(String[] args) {
        add(100500);
        Solution s = new Solution();

        s.salary = 100;

        System.out.println(s.salary);
    }
}
