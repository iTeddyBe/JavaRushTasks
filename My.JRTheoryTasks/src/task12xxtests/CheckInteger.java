package task12xxtests;

public class CheckInteger {

    public static void main(String[] args) {
        Integer a = 50;
        Integer b = a;
        int c = a;

        System.out.println(a == b); // сравнение ссылок
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println();

        Integer a2 = 500;
        Integer b2 = 500;
        int c2 = 500;

        System.out.println(a2 == b2); // сравнение ссылок
        System.out.println(a2 == c2);
        System.out.println(b2 == c2);

    }
}
