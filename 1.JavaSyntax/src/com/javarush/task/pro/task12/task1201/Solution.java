package com.javarush.task.pro.task12.task1201;

/* 
Автоупаковка
*/

public class Solution {
    public static byte byteValue = 12;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);

    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);

    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);

//    Byte byteValueBox2 = new Byte(byteValue).valueOf(byteValue);

    public static void main(String[] args) {
        Byte byteValueBox2a = new Byte(byteValue);
        Byte byteValueBox2b = new Byte(byteValue);
        Byte byteValueBox3 = Byte.valueOf(byteValue);

    }

}
