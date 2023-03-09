package com.javarush.task.pro.task13.task1317;

/* 
Трансформируем enum в класс
*/

import java.lang.reflect.Field;

public class Month {
    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);

    public static int countObjects = 0;
    public int publicObjectField = 1;

    //public Month DECEMBER1 = new Month(11);

    private int value;
    private String name;

    private Month(int value) {
        this.value = value;
        this.name = switch (value) {
            case 0 -> "JANUARY";
            case 1 -> "FEBRUARY";
            case 2 -> "MARCH";
            case 3 -> "APRIL";
            case 4 -> "MAY";
            case 5 -> "JUNE";
            case 6 -> "JULY";
            case 7 -> "AUGUST";
            case 8 -> "SEPTEMBER";
            case 9 -> "OCTOBER";
            case 10 -> "NOVEMBER";
            case 11 -> "DECEMBER";
            default -> "none";
        };
    }

    public static Month[] values() /* throws IllegalAccessException */ {
        Month[] monthes = new Month[12];
        Field[] fields = Month.class.getDeclaredFields();
        int counter = 0;
        for (Field field : fields) {
            if (field.getType() == Month.class) {
                try {
                    Month objectMonth = (Month) field.get(Month.class);
                    monthes[counter] = objectMonth;
                } catch (IllegalAccessException e) {
                    // empty
                }
                counter++;
            }
        }
        return monthes;
    }

    public int ordinal() {
        return this.value;
    }

    @Override
    public String toString() {
//        return Month.class.getDeclaredFields()[value].getName();
        return this.name;
    }

    // === for non-static-Fields
    // throws NoSuchFieldException = for field.getType();
    public Month[] valuesNonStatic() /*throws IllegalAccessException*/ {
        Month[] monthes = new Month[12];
        Field[] fields = Month.class.getDeclaredFields();
        int counter = 0;
        for (Field field : fields) {
            if (field.getType() == this.getClass()) {
                try {
                    Month objectMonth = (Month) field.get(this);
                    monthes[counter] = objectMonth;
                } catch (IllegalAccessException e) {
                    // null
                }
                counter++;
            }
        }
        return monthes;
    }

    public static Month[] values2() {
        Month[] monthes = new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
        return monthes;
    }

    // Empty constructor - need for Main.main()
    public Month() {
        System.out.println("constructor: public Month()");
        this.name = "common object (" + this.getClass().getSimpleName() + ")";

    }

    public int getCountObjects(){
        return this.countObjects;
    }

    public void setCountObjects(int countObjects) {
        Month.countObjects = countObjects;
    }
}
