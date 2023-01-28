package denFieldExperement;

public class Tr {
    private String str;

    public Tr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void nothing (Entity eParam){
        eParam = new Entity(50);
    }

    public void doSomthing(Entity eParam){
        eParam.setOrivatX(110);

    }
}
