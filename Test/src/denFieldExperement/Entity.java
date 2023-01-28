package denFieldExperement;

public class Entity {

    public static int fieldS = 10;
    private int orivatX;
    private double fieldA;

    public Entity(int param){
        this.orivatX = param;
    }

    public int getOrivatX() {
        return orivatX;
    }

    public void setOrivatX(int paramX) {
        this.orivatX = paramX;
        paramX = 10;
    }
    public int get(){
        return this.orivatX *2;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "orivatX=" + orivatX + " " +
                "fieldA=" + fieldA +
                '}';
    }
}
