package denFieldExperement;

public class ListTest {
    public static void main(String[] args) {

        String str = "MaxTest";
        str.toUpperCase();

        System.out.println(str.toUpperCase() + " " + str);
        int y = 2;
        Entity ent = new Entity(5);
        System.out.println(Entity.fieldS);
        System.out.println(ent.getOrivatX());
        ent.setOrivatX(y);
        System.out.println(ent.getOrivatX());
        System.out.println(y);
        y = ent.get();
        System.out.println(y);



        Tr tr = new Tr("a");
        tr.nothing(ent);
        System.out.println(ent);
        tr.doSomthing(ent);
        System.out.println(ent);
    }
}
