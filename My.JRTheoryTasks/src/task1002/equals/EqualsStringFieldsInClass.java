package task1002.equals;

public class EqualsStringFieldsInClass {
    //https://javarush.com/quests/lectures/questsyntaxpro.level10.lecture04
    // == из комментария

    public static void main(String[] args) {
        Cat1 cat1a = new Cat1("Barsik");
        Cat1 cat1b = new Cat1("Barsik");

        // == Добавляются в StringPool в конструкторе класса "Cat", поэтому true

        // Т.е. строка добавляется в пул строк, и когда вы создаете второй объект, то java находит в пуле уже
        // существующую строку "Barsik" и выдает ссылку на него. Другими словами у вас два разные поля ссылаются
        // на одну и ту же строку в пуле строк.
        System.out.println("(cat1a.name == cat1b.name) = " + fmtBool((cat1a.name == cat1b.name))
                + " (cat1a.name.equals(cat1b.name)) = " + fmtBool((cat1a.name.equals(cat1b.name))));

        Cat2 cat2a = new Cat2("Barsik");
        Cat2 cat2b = new Cat2("Barsik");

        // == А здесь в классе "Cat2" не добавляется в StringPool, а создается новый объект строка каждый раз
        System.out.println("(cat2a.name == cat2b.name) = " + fmtBool((cat2a.name == cat2b.name))
                + " (cat2a.name.equals(cat2b.name)) = " + fmtBool((cat2a.name.equals(cat2b.name))));

        System.out.println(cat1a.getClass());
        System.out.println(cat2a.getClass());
    }

    public static String fmtBool(boolean boolVal) {
        String colorVal = (boolVal == true) ? "\uu001B[92m" : "\uu001B[93m";
        return String.format("%1$s[%2$5s]\uu001B[0m", colorVal, boolVal);
    }

    // ======================================================================
    public static class Cat1 {
        String name;

        public Cat1(String name) {
            this.name = name;
        }
    }

    // ======================================================================
    public static class Cat2 {
        String name;

        public Cat2(String name) {
            this.name = new String(name);
        }
    }
}


