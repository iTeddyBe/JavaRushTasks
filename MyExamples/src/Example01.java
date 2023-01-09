import java.util.Scanner;

public class Example01 {


    public static void main(String[] args) {
        System.out.println("out text");

        Scanner text_in = new Scanner("text");

        System.out.println(text_in.nextLine());

        Scanner keyboard_in = new Scanner(System.in);

        String line01 = keyboard_in.nextLine();
        System.out.println(line01.toUpperCase());
    }

}
