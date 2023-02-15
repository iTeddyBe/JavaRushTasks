package task1002.equals;

public class ExtendsChild extends ExtendsParent {
    public String c = Main.print("ExChl.c");

    public void initialize() {
        Main.print(this.a);
    }

    public ExtendsChild() {
        this.initialize();
        Main.print("ExtendsChild - constructor");
        super.printEP(getClass().getSimpleName() + " / " + getClass().getName());
    }

}
