package task1002;

public class ExtendsChild extends ExtendsParent {
    public String c = Main.print("ExtendsChild.c");

    public void initialize() {
        Main.print(this.a);
    }

    public ExtendsChild() {
        this.initialize();
        Main.print("ExtendsChild - constructor");
    }

}
