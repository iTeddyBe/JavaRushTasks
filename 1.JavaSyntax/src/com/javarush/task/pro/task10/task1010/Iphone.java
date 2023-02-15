package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
//        if (obj == null)
//            return false;

//        if (!(obj instanceof Iphone))
//            return false;

        Iphone iphone = (Iphone) obj;

//        if (this.model.equals(iphone.model) == false)
//            return false;
//
//        if (this.color.equals(iphone.color) == false)
//            return false;

//        if (this.price != iphone.price)
//            return false;

        return this.price == iphone.price
                && Objects.equals(this.model, iphone.model)
                && Objects.equals(this.color, iphone.color);

    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
