package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

//C:\java\JavaRushTasks\1.JavaSyntax\src\com\javarush\task\pro\task15\task1504\file1.txt
//C:\java\JavaRushTasks\1.JavaSyntax\src\com\javarush\task\pro\task15\task1504\file2.txt

public class Solution {
    // Компактный вариант через try()-resource-catch() block - ввод файлов через Scanner

    public static void main(String[] args) { // === !!! === throws IOException - no need for try()-resource-catch() block
        try (Scanner console = new Scanner(System.in);
             InputStream inputFile = Files.newInputStream(Paths.get(console.nextLine()));
             OutputStream outputFile = Files.newOutputStream(Paths.get(console.nextLine()));
        ) {
            byte[] buffer100 = new byte[100];

            while (inputFile.available() > 0) {
                int readBytes = inputFile.read(buffer100);

                for (int i = 0; i < ((readBytes / 2) * 2); i = i + 2) {
                    byte tmp = buffer100[i];
                    buffer100[i] = buffer100[i + 1];
                    buffer100[i + 1] = tmp;
                }

                outputFile.write(buffer100, 0, readBytes);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }



}

