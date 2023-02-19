package tests;

import java.util.Arrays;

public class TestOverrideCat {
    private String name;

    public TestOverrideCat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        TestOverrideCat[] cats = new TestOverrideCat[3];
        cats[0] = new TestOverrideCat("Томас");
        cats[1] = new TestOverrideCat("Бегемот");
        cats[2] = new TestOverrideCat("Филипп Маркович");

        cats[1] = null;

        System.out.println(Arrays.toString(cats));
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
