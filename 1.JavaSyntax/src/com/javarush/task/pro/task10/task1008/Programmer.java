package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }

}
