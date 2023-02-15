package classExplorer;

import jdk.dynalink.beans.StaticClass;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassExplorer {

    public static void main(String[] args) {
        Class dogClass = Dog.class;

        showClassDetails(String.class, false);
        showClassDetails(Object.class, false);
        showClassDetails(Cat.class, true);
        showClassDetails(Cat.class, false);
        showClassDetails(dogClass, true);

        Cat cat = new Cat();
        cat.sayManySounds("Say", "One", "1", "one");

        StaticClass.methodStatic();
        StaticClass staticClassEntity = new StaticClass(); // _NotUsedNow
    }

    public static void showClassDetails(Class clazz, boolean isShowAllMethods) {
        int fieldsCount = clazz.getDeclaredFields().length;
        int methodCount = clazz.getDeclaredMethods().length;
        List<String> fieldNames = new ArrayList<>();
        List<String> methodNames = new ArrayList<>();

        for (Field field : clazz.getDeclaredFields()) {
            String fieldStringBeginner = (fieldNames.size() == 0) ? "\b" : "\n\t";

            fieldNames.add(fieldStringBeginner
                    + " \u001B[93m" + Modifier.toString(field.getModifiers())
                    + " \u001B[94m" + field.getType().getSimpleName()
                    + " \u001B[97m" + field.getName() + "\u001B[00m");
        }

        //System.out.println(Arrays.deepToString(method.getParameters()));
        //for (Method method : clazz.getDeclaredMethods()) {

        Method[] arrayMethods;
        if (isShowAllMethods) {
            arrayMethods = clazz.getMethods();
        } else {
            arrayMethods = clazz.getDeclaredMethods();
        }

        for (Method method : arrayMethods) {
            String methodStringBeginner = (methodNames.size() == 0) ? "\b" : "\n\t";
            String methodParams = "";

            for (Parameter param : method.getParameters()) {
                methodParams = methodParams + param.getType().getSimpleName() + " " + param.getName() + ", ";
            }


            if (methodParams.length() > 0) {
                methodParams = methodParams.substring(0, methodParams.length() - 2);
                //methodParams += "\b\b";
            }

            methodNames.add(methodStringBeginner
                    + " \u001B[93m" + Modifier.toString(method.getModifiers())
                    + " \u001B[94m" + method.getReturnType().getSimpleName() + " -> " + method.getDeclaringClass().getSimpleName()
                    + " \u001B[97m" + method.getName() + "\u001B[00m ("
                    + "\u001B[92m" + methodParams + "\u001B[00m)");
        }

        System.out.println("\nInformation about class: \u001B[91m" + clazz.getSimpleName() + "\u001B[00m");
        System.out.println("Class has " + fieldsCount + " field(s): \n\t" + fieldNames + "\b");
        System.out.printf("Class has %s method(s):\n\t%s\b\n", arrayMethods.length, methodNames);
    }

    public static class StaticClass extends Object{

        public StaticClass() {
            System.out.println("constructor " + this.getClass().getSimpleName());
            method1();
            showClassDetails(this.getClass(), true);
        }

        public void method1(){
            System.out.println(this.getClass().getDeclaredMethods().length);
            System.out.println(Arrays.deepToString(this.getClass().getMethods()));
        }

        public static void methodStatic(){
            System.out.println("methodStatic");
        }

    }

}


class Cat {
    private int _age;
    private String _color;
    private static final PrintStream _sout = System.out;

    public void meow(String str, int cnt) {
        _sout.println("meow");
    }

    public void sayManySounds(String ... phrases) {
        for (String phrase: phrases) {
            System.out.print("Cat " + " say: " + phrase);
        }
        System.out.println();
    }

    public void catSleep() {
        System.out.println("Just sleep - no in-params");
    }
}

class Dog {
    private String name;
    private boolean hasTrained;
    private int tailLength;

    public void bark(int cnt) {
        System.out.println("wuff-wuff ");
    }

    public void catchThief(boolean isSleepNow) {
        if (isSleepNow) {
            System.out.println("sleep-sleep");
        } else {
            System.out.println("wuff-wuff, bite-bite");
        }
    }
}
