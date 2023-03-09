package task14xx;

public class ExampleMyException {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception except) {

            System.out.println("RuntimeException");
        }
    }
}
