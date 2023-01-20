package tasks04x;

import java.util.Scanner;


public class Example0405a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (input.hasNextInt()) {
            int x = input.nextInt();
            if (x > max) {
                max = x;
            }
        }

        System.out.println(max);
    }
}
