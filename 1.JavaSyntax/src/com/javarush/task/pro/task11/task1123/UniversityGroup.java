package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;

/* 
Почувствуй себя деканом
*/

public class UniversityGroup {
    public List<String> students;

    public static void main(String[] args) {
        UniversityGroup universityGroup1 = new UniversityGroup();
        UniversityGroup universityGroup2 = new UniversityGroup();
        UniversityGroup universityGroup3 = new UniversityGroup();
        UniversityGroup universityGroup4 = new UniversityGroup();
        UniversityGroup universityGroup5 = new UniversityGroup();

        universityGroup1.exclude1("Виталий Правдивый");
        universityGroup1.students.forEach(System.out::println);

        System.out.println("=====");
        universityGroup2.exclude2("Виталий Правдивый");
        universityGroup2.students.forEach(System.out::println);

        System.out.println("=====");
        universityGroup3.exclude3("Виталий Правдивый");
        universityGroup3.students.forEach(System.out::println);

        System.out.println("===== вариант правильное решение ======");
        universityGroup4.exclude4("Виталий Правдивый");
        universityGroup4.students.forEach(System.out::println);

        System.out.println("=====");

        universityGroup5.excludeAllOther("Николай Соболев");
        universityGroup5.students.forEach(System.out::println);
    }

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
        students.add("Виталий Правдивый");
    }

    public void exclude1(String excludedStudent) {
        List<String> copyStudents = new ArrayList<>(students);

        for (String student : copyStudents) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public void exclude2(String excludedStudent) {
        for (String student : students) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
                break;
            }
        }
    }

    public void exclude3(String excludedStudent) {
        students.remove(excludedStudent);
    }

    public void exclude4(String excludedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(excludedStudent)) {
                students.remove(i);
            }
        }
    }

    public void excludeAllOther(String excludedStudent) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Current index = " + i);
            if (!students.get(i).equals(excludedStudent)) {
                students.remove(i);
                i--;
            }

        }
    }
}