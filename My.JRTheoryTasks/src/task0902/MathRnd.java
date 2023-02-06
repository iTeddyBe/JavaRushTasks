package task0902;

public class MathRnd {

    public static void main(String[] args) {
        System.out.println("=[10 random digits]=================");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        System.out.println("=[random digits (1..6)]=================");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(getRandomDiceNumber() + " ");
            }
            System.out.println();
        }
    }

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 6) + 1;
    }
}
