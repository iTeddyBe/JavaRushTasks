package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        boolean useScanner = false;
        Scanner scanner = new Scanner(System.in);
        String line = ((useScanner == true) ? scanner.nextLine() : "https://javarush.com");

        URL url = new URL(line);
        try (InputStream inputStream = url.openStream();) {
            Path tmpFile = Files.createTempFile(null, null);

            byte[] buffer = inputStream.readAllBytes();

            Files.write(tmpFile, buffer);

        } catch (Exception e) {
            System.out.println("Some exaption : " + e);
        }
    }
}