package com.javarush.task.pro.task15.task1520;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        try (DirectoryStream<Path> listFiles = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : listFiles) {
                if (Files.isRegularFile(path)) {
                    Path pathResolve = targetDirectory.resolve(path.getFileName());
                    Files.move(path, pathResolve);
                }
            }
        } catch (Exception e) {
            System.out.println("Have error : " + e);
        }
    }
}

