package task1002.equals;

public class CompareObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name1 = "Anna";
        person2.name1 = "Anna";
        person1.age = 19;
        person2.age = 19;
        person1.Integer1 = 24;
        person2.Integer1 = 24;

        System.out.println("(person1 == person2) = " + (person1 == person2) + " " + person1 + " " + person2);
        System.out.println("(person1.equals(person2)) = " + (person1.equals(person2)));
        System.out.println("==========");

        System.out.println("(person1.name1 == person2.name1) = " + (person1.name1 == person2.name1) + " " + person1.name1 + " " + person2.name1);
        System.out.println("(person1.name1.equals(person2.name1)) = " + (person1.name1.equals(person2.name1)));
        System.out.println("==========");

        System.out.println("(person1.name2 == person2.name2) = " + (person1.name2 == person2.name2) + " " + person1.name2 + " " + person2.name2);
        System.out.println("(person1.name2.equals(person2.name2)) = " + (person1.name2.equals(person2.name2)));
        System.out.println("(person1.name1.equals(person2.name2)) = " + (person1.name1.equals(person2.name2)));
        System.out.println("==========");

        System.out.println("(person1.age == person2.age) = " + (person1.age == person2.age) + " " + person1.age + " " + person2.age);
        //System.out.println("(person1.age.equals(person2.age)) = " + (person1.age.equals(person2.age)));
        System.out.println("==========");

        System.out.println("(person1.Integer1 == person2.Integer1) = " + (person1.Integer1 == person2.Integer1) + " " + person1.Integer1 + " " + person2.Integer1);
        System.out.println("(person1.Integer1.equals(person2.Integer1)) = " + (person1.Integer1.equals(person2.Integer1)));
        System.out.println("==========");

        System.out.println("(person1.Integer2 == person2.Integer2) = " + (person1.Integer2 == person2.Integer2) + " " + person1.Integer2 + " " + person2.Integer2);
        System.out.println("(person1.Integer2.equals(person2.Integer2)) = " + (person1.Integer2.equals(person2.Integer2)));
        System.out.println("==========");

        System.out.println("(person1.dbl == person2.dbl) = " + (person1.dbl == person2.dbl) + " " + person1.dbl + " " + person2.dbl);
        // = error = System.out.println("(person1.dbl.equals(person2.dbl)) = " + (person1.dbl.equals(person2.dbl)));
        System.out.println("==========");

        person2.dbl = 20.120000000000001;

        System.out.println("(person1.dbl == person2.dbl) = " + (person1.dbl == person2.dbl) + " " + person1.dbl + " " + person2.dbl);
        System.out.println("==========");

        person2.dbl = 20.12000000000001;

        System.out.println("(person1.dbl == person2.dbl) = " + (person1.dbl == person2.dbl) + " " + person1.dbl + " " + person2.dbl);
        System.out.println("==========");

    }
}

class Person extends Object {
    public String name1;
    public String name2 = new String("Anna");
    public int age;
    public Integer Integer1;
    public Integer Integer2 = new Integer(10);
    public double dbl = 20.12;
}