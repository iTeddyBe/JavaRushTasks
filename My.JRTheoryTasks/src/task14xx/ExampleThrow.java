package task14xx;

public class ExampleThrow {

    public static void main(String[] args) {
        try {
            int result = 2 / 0;
        } catch (Exception e) {
            System.out.println("Exception");
            throw e;
        }
    }
}
