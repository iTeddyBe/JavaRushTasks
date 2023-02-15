package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();

        printALs();
        paySalaryMY("Гвинно");
        printALs();
    }

    public static void paySalaryMY(String name) {
        if ((name != null)) { // === Нет необходимости = if (ArrayList.contains(NULL)) = FALSE на выходе
            int index = waitingEmployees.indexOf(name);

            if (index != -1) {
                if (!alreadyGotSalaryEmployees.contains(name)) {
                    waitingEmployees.set(index, null);
                    alreadyGotSalaryEmployees.add(name);
                }
            }
        }
    }

    public static void paySalaryJR(String name) {
        var result = waitingEmployees.contains(name);
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }

    public static void printALs() {
        System.out.println("\nwaitingEmployees :\n\t" + waitingEmployees);
        System.out.println("alreadyGotSalaryEmployees :\n\t" + alreadyGotSalaryEmployees);
    }
}
