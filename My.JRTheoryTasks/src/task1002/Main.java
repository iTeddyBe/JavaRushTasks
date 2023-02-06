package task1002;

public class Main {
    public static void main(String[] args) {
        ExtendsChild eChild = new ExtendsChild();
        print(eChild.a);
        print(eChild.c);
        print("main");

    }

    public static String print(String text) {
        System.out.println("Main.print(): " + text);
        return text;
    }


}
