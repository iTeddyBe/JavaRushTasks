package task14xx;

import java.util.Arrays;

public class ExampleStackTrace2 {

    public static void main(String[] args) {
        try {

        } finally {

        }

        callMethod();
    }

    private static void callMethod() {
        try {
            int int1 = Integer.parseInt(null);
        } catch (Exception e) {
            System.out.println("\ne.printStackTrace()");
            //e.printStackTrace();

            StackTraceElement[] stackTraceElements = e.getStackTrace();

            System.out.println("\nfor()");
            for (StackTraceElement item : stackTraceElements) {
                System.out.println(item);
            }

            System.out.println("\nArrays.asList.forEach()");
            Arrays.asList(stackTraceElements).forEach(System.out::println);
            //throw new RuntimeException(e);
        }
    }
}
