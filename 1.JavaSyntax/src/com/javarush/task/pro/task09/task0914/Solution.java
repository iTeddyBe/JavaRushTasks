package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
    }

    public static String changePath(String path, String jdk) {
        int indexStart = path.indexOf("jdk");
        int indexEnd   = path.indexOf("/", indexStart);
        String oldJdk  = path.substring(indexStart, indexEnd);

        return path.replace(oldJdk, jdk);
    }
}
