package com.javarush.task.pro.task13.task1317;


import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    //@lombok.SneakyThrows
    public static void main(String[] args)
            //throws NoSuchFieldException
            //throws IllegalAccessException
    {
        System.out.println(Month.countObjects);
        Month m1 = new Month();
        Month m2a = new Month();
        m1.setCountObjects(m1.getCountObjects()+10);
//        Arrays.asList(m1.getClass().getDeclaredFields()).forEach(System.out::println);
//        System.out.println();
//        Arrays.asList(m1.getClass().getFields()).forEach(System.out::println);

        System.out.println(Month.countObjects);
        m2a.setCountObjects(m2a.getCountObjects()+10);

        System.out.println(Month.countObjects);

        try {
            Field f1 = m1.getClass().getField("countObjects");
            System.out.println(f1.toString());
            Object o = f1.get(f1);
            f1.set(o, 14);
            System.out.println(Month.countObjects);
            m1.getClass().getField("countObjects").setInt(f1, 12);
            System.out.println(Month.countObjects);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println(Month.countObjects);


        if (1==1) {
            return;
        }

        Month m2 = new Month();
        System.out.println(m1);
        System.out.println("===");
        Month[] arrayM = Month.values();
        for (Month month : arrayM) {
            System.out.println(month.toString());
        }

        System.out.println("===");
        Month objectMonth = new Month();
        for (Month month : objectMonth.valuesNonStatic()) {
            System.out.println(month);
        }

        System.out.println("===");
        System.out.println(Arrays.toString(objectMonth.valuesNonStatic()));

        //Class reflectClass = (Class) month.getClass();
        //Class<?> fl = month.getClass().getDeclaredField("m1").getType();
        //Object o = month.getClass().getDeclaredField("m1").get(month);

        //System.out.println(fl);
        //System.out.println(month.getClass().getField("DECEMBE").getType().getCanonicalName());
        //Integer i1 = month.getClass().getField("DECEMBE").getDeclaringClass();



    }
}
