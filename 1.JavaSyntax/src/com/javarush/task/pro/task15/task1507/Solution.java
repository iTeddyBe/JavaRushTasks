package com.javarush.task.pro.task15.task1507;

//import sun.nio.cs.UTF_8;
import java.io.File;
import java.nio.charset.Charset;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //Path filePath = Path.of(scanner.nextLine());
        Path filePath = Path.of("C:\\Temp\\file2.txt");
        List<String> lst = new ArrayList<>();
        byte[] arrayB = new byte[100];
        //File
        String s = new String(arrayB, "CP866");
        //List<String> linesFile = Files.readAllLines(filePath, Charset.forName("CP866"));
        List<String> linesFile = Files.readAllLines(filePath);

        for (int i = 0; i < linesFile.size(); i += 2) {
            //System.out.println(linesFile.get(i));
            System.out.println("ага");
        }
    }
}

