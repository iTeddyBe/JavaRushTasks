package task1002;

public class ExtendsParent {
    public String a;

    {
        Main.print(this.a);
        this.a = "ExtendsParent = a";
        Main.print(this.a);
    }

    public ExtendsParent() {
        Main.print("ExtendsParent - constructor");
    }
}
