package task1002.equals;

public class ExtendsParent {
    public String a;

    {
        Main.print(this.a);
        this.a = "ExtendsParent = a1";
        Main.print(this.a);
    }

    public ExtendsParent() {
        Main.print("ExtendsParent - constructor");
    }

    public void printEP(String  str) {
        System.out.println(str);
    }
}
