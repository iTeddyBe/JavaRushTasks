package task1002.equals;

import java.util.Objects;

public class Main {
    public static ExtendsChild eCh1 = new ExtendsChild();
    public static ExtendsChild eCh2 = new ExtendsChild();

    public static void main(String[] args) {
        ExtendsChild eChild = new ExtendsChild();
        print(eChild.a);
        print(eChild.c);
        print("main");
        System.out.println(eCh1.hashCode());
        System.out.println(eCh2.hashCode());

        System.out.println("NEXT block === Check String Object");
        String str = new String();
        System.out.println("str(1) = " + (str == ""));
        str = "";
        System.out.println("str(2) = " + (str == ""));
        str = null;
        System.out.println("str(3) = " + (str == ""));
        System.out.println("str(4) = " + (str == null));

        System.out.println("NEXT block ===");
        SimpleClass a = new SimpleClass();
        SimpleClass b = new SimpleClass();
        // = Переприсовили объект "b = a" по ссылке, т.е. теперь объекты ссылаются на один и тот же объект в памяти
        //b = a;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b)) ;
        System.out.println(Objects.equals(a, b)) ;

        // == Experiment 2

        printCompareObjects();

        eCh1.c = "String1";
        eCh2.c = "String2";
        printCompareObjects();
        eCh2.c = "String1";
        printCompareObjects();

    }

    public static void printCompareObjects() {
        System.out.println("PCO: " + " (eCh1 == eCh2) = " + (eCh1 == eCh2) + " eCh1.c = " + eCh1.c + " eCh2.c = " + eCh2.c
                + " (eCh1.c == eCh2.c) = " + boolFmt((eCh1.c == eCh2.c))
                + " (eCh1.c.equals(eCh2.c)) = " + boolFmt((eCh1.c.equals(eCh2.c))) + " (eCh1.equals(eCh2)) = " + boolFmt((eCh1.equals(eCh2))));
    }

    public static String boolFmt(Boolean bool) {
        String colorBool = (bool) ? "\u001B[92m" : "\u001B[91m";
        return colorBool + String.format("[%-5s]", bool) + "\u001B[0m";
    }

    public static String print(String text) {
        System.out.println("Main.print(): " + text);
        return text;
    }


}
