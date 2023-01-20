package tasks04x;

import java.util.Scanner;

public class Example0405 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            sum = sum + x;
            System.out.println("int=" + x + " sum=" + sum);
        }
        System.out.println("Result sum=" + sum);
    }
}
