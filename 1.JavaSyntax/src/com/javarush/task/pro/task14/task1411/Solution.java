package com.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Распаковка исключений
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");

        } catch (RuntimeException e) {
            Throwable throwableE = e.getCause();

            if (throwableE instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (throwableE instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
/**
 * === My first variant - check using getClass()
 *
        } catch (RuntimeException e) {
            Throwable thrEx = e.getCause();

            if ( thrEx instanceof Exception) {
                Exception exp = (Exception) thrEx;
                if (exp.getClass() == FileNotFoundException.class) {
                    System.out.println(FAILED_TO_READ);
                } else if (exp.getClass() == FileSystemException.class) {
                    System.out.println(FAILED_TO_WRITE);
                }
            }
        }
*/
    }
}
