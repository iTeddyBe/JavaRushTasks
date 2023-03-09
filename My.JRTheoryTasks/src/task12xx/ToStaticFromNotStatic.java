package task12xx;

import java.util.Arrays;

public class ToStaticFromNotStatic {
    public static int intStatic = 10;
    public int intNoStatic = 20;

    public static void main(String[] args) {
        ToStaticFromNotStatic object = new ToStaticFromNotStatic();
        object.printNotStaticMethod("some text1 ");

        object.printStaticMethod("some text2");

        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println(Arrays.asList(e.getStackTrace()));
            System.out.println();
            e.printStackTrace();
            //throw new  RuntimeException(e);
            // === public class RuntimeException extends Exception
        }
    }

    public void printNotStaticMethod(String text) {
        System.out.println("<<printNotStatic>> " + text + " " + intStatic + " " + this.intNoStatic);
        printStaticMethod("from no static");
    }

    public static void printStaticMethod(String text) {
        System.out.println("<<printStaticMethod>> " + text + " " + intStatic + " (intNoStatic = no)");
        // NO = printNotStaticMethod("from static");
    }

}
