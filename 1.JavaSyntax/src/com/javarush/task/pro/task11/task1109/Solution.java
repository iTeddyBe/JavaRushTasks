package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        // === Variant 1
        Outer.Inner outerInner1 = new Outer().new Inner();
        Outer.Nested outerNested1 = new Outer.Nested();

    }
}
