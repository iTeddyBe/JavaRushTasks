package com.javarush.task.pro.task11.task1119;

import java.lang.reflect.Modifier;
import java.util.Objects;

/* 
Яблоки бывают разные
*/

public class Solution {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");

        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("телефоны одинаковые");
        }
    }
}

class CellPhone {
    String vendor;
    String model;
    private static int checkField = 100;

    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        var varClass1 = getClass();
        var varClass2 = o.getClass();

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellPhone cellPhone = (CellPhone) o;
        return Objects.deepEquals(vendor, cellPhone.vendor) &&
                Objects.deepEquals(model, cellPhone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, model);
    }
}