package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Date;

/* 
Перепутанные байты
*/
//C:\java\JavaRushTasks\1.JavaSyntax\src\com\javarush\task\pro\task15\task1504\file1.txt
//C:\java\JavaRushTasks\1.JavaSyntax\src\com\javarush\task\pro\task15\task1504\file2.txt

// === HDD file.size 100Mb [2] = (2405.947 secs)
// === HDD file.size 100Mb [1024]= (0.787 secs) 1000.Mb (27.064)
// === HDD file.size 1000.Mb [1024] (27.064) SSD (9.466)
// === HDD file.size 1000.Mb [2048] (5.629)  SSD (6.635)
// === HDD file.size 1000.Mb [4096] (3.961)  SSD (5.135)
// === HDD file.size 1000.Mb [8192] (3.351)

public class SolutionMyReadWrite {

    public static void main2(String[] args) throws IOException {
        String strPath1 = "C:\\java\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\pro\\task15\\task1504\\file1.txt";
        //String strPath2 = "C:\\java\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\pro\\task15\\task1504\\file2.txt";

        String pathFile = "C:/java/JavaRushTasks/1.JavaSyntax/src/com/javarush/task/pro/task15/task1504";

        Path path1 = Paths.get(strPath1);               // variant 1
        Path path2 = Paths.get(pathFile, "file2a.txt"); // variant 2

        InputStream fileIn = null;
        OutputStream fileOut = null;

        try {
            fileIn = Files.newInputStream(path1);
            fileOut = Files.newOutputStream(path2);

            byte[] buffer = new byte[1024];

            while (fileIn.available() > 0) {
                int readBytes = fileIn.read(buffer);

                for (int i = 0; i < ((readBytes / 2) * 2); i = i + 2) {
                    byte tmp = buffer[i];
                    buffer[i] = buffer[i + 1];
                    buffer[i + 1] = tmp;
                }
                fileOut.write(buffer, 0, readBytes);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }

    //mainTest2Bytes
    public static void main3(String[] args) throws IOException {
//        String strPath1 = "D:\\_Download\\file1.txt";
//        String strPath2 = "D:\\_Download\\file2.txt";

        String strPath1 = "C:\\Temp\\file1.txt";
        String strPath2 = "C:\\Temp\\file2.txt";

        Path path1 = Paths.get(strPath1);
        Path path2 = Paths.get(strPath2);


        try (InputStream inputFile = Files.newInputStream(path1);
             OutputStream outputFile = Files.newOutputStream(path2);
        ) {
            Date date1 = new Date();


            byte[] buffer = new byte[1024];

            while (inputFile.available() > 0) {
                int readBytes = inputFile.read(buffer);

                for (int i = 0; i < readBytes - 1; i = i + 2) {
                    byte tmp = buffer[i];
                    buffer[i] = buffer[i + 1];
                    buffer[i + 1] = tmp;
                }

                outputFile.write(buffer, 0, readBytes);
            }

            Date date2 = new Date();
            Long secL = (date2.getTime() - date1.getTime());
            Double sec = (secL.doubleValue()) / 1000;
            System.out.println(sec);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void mainFUllRemarks(String[] args) throws IOException {
        String strPath1 = "C:\\java\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\pro\\task15\\task1504\\file1.txt";
        String strPath2 = "C:\\java\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\pro\\task15\\task1504\\file2.txt";

        String pathFile = "C:/java/JavaRushTasks/1.JavaSyntax/src/com/javarush/task/pro/task15/task1504";

        Path path1 = Paths.get(strPath1);
        //Path path2 = Paths.get(strPath2);
        Path path2 = Paths.get(pathFile, "file2a.txt");

        InputStream inputFile = null;
        OutputStream outputFile = null;

        try {
            inputFile = Files.newInputStream(path1);
            outputFile = Files.newOutputStream(path2);

            int bufferSize = 128;
            byte[] buffer = new byte[bufferSize];

            while (inputFile.available() > 0) {
                int readBytes = inputFile.read(buffer);

                // === Отсекаем прохождение в цикле последней итерации в случае, если считано нечетное число байт
                int evenReadBytes = ((readBytes / 2) * 2);

                for (int i = 0; i < evenReadBytes; i = i + 2) {
                /*
                for (int i = 0; i < readBytes; i = i + 2) {
                    if (i >= (readBytes - 1)) {
                    // === Последнюю итерацию цикла обрываем - зайдет только для нечетного (воспринимается такая проверка сложно)
                        break;
                    }
                 */
                    byte tmp = buffer[i];
                    buffer[i] = buffer[i + 1];
                    buffer[i + 1] = tmp;
                }

                outputFile.write(buffer, 0, readBytes);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
            if (outputFile != null) {
                outputFile.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        String strPath1 = "D:\\_Download\\file1.txt";
//        String strPath2 = "D:\\_Download\\file2.txt";

        String strPath1 = "C:\\Temp\\file1.txt";
        String strPath2 = "C:\\Temp\\file2.txt";

        Path path1 = Paths.get(strPath1);
        Path path2 = Paths.get(strPath2);


        try (InputStream inputFile = Files.newInputStream(path1);
             OutputStream outputFile = Files.newOutputStream(path2);
        ) {
            byte[] first = inputFile.readAllBytes();
            for (int i = 0; i <= first.length; i += 2) {
                if (first.length - i > 2) {
                    outputFile.write(first[i + 1]);
                    outputFile.write(first[i]);
                } else outputFile.write(first[first.length - 1]);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


}

