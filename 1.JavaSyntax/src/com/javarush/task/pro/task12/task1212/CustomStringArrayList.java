package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public String[] getArray(){
        return elements;
    }

    private void grow() {
        int newCapacity = (int)(capacity * 1.5);
        String[] arrayTemps = new String[newCapacity];

        //System.arraycopy(elements, 0, arrayTemps, 0, elements.length);
        // Arrays.copyOf() - метод возвращает и инициализирует массив с новым размером (newCapacity)
        // в объявлении выше "new String[newCapacity]" указывать не обязательно (компилятор это подсказывает)
        arrayTemps = Arrays.copyOf(elements, newCapacity);

        elements = arrayTemps;
        capacity = newCapacity;
    }

    private void growSimple() {
        // === My variant - very simple
        int newCapacity = (int)(capacity * 1.5);
        String[] arrayTemps = new String[newCapacity];

        for (int i = 0; i < elements.length; i++) {
            arrayTemps[i] = elements[i];
        }

        elements = arrayTemps;
        capacity = newCapacity;
    }
}
