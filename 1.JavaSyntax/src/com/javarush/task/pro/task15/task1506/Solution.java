package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {

        //C:\Temp\file1.txt
        try (Scanner scanner = new Scanner(System.in);) {
            List<String> listLines = Files.readAllLines(Paths.get(scanner.nextLine()));

            for (String s : listLines) {
                //System.out.println(listLine.replaceAll("[\\.,\\s]", ""));
                // == Можно так - в [] не надо экранировать - писали в комментарии к этой задаче - пока не знаю почему
                //System.out.println(s.replaceAll("[., ]", ""));
                System.out.println(s.replaceAll("[\\.,\\s]", ""));
            }

            // variant from JavaRush - как-то заморочено для задачи, но интересно для изучения
            listLines.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Have Exception: " + e);
        }
    }
}

