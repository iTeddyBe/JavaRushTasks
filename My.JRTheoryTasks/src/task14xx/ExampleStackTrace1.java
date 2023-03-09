package task14xx;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class ExampleStackTrace1 {

    private int fieldAge = 10;

    public static void main(String[] args) {
        ExampleStackTrace1 est = new ExampleStackTrace1();
        est.testStackTrace();
        System.out.println();
        //Arrays.asList(ExampleStackTrace.class.getMethods()).forEach(System.out::println);

        List<Method> strMethods = Arrays.asList(ExampleStackTrace1.class.getMethods());
        for (Method strMethod : strMethods) {
            System.out.println(strMethod.toString().replace("task14xx.ExampleStackTrace.1", "-> "));
            System.out.println(Modifier.toString(strMethod.getModifiers()));

        }
    }

    private void testStackTrace() {
        Thread currentTread = Thread.currentThread();

        StackTraceElement[] methods = currentTread.getStackTrace();

        System.out.println();
        for (StackTraceElement method : methods) {
            System.out.println("method: " + method
                    + ((method.getModuleName() != null) ? "\ngetModuleName(): " + method.getModuleName() : "")
                    + ((method.getModuleVersion() != null) ? " = getModuleName(): " + method.getModuleVersion() : "")
                    + "\ngetMethodName(): " + method.getMethodName()
                    + "\ngetLineNumber(): " + method.getLineNumber());
        }
    }

    public int getFieldAge(){
        return fieldAge;
    }

    public void setFieldAge(int fieldAge) {
        this.fieldAge = fieldAge;
    }
}
