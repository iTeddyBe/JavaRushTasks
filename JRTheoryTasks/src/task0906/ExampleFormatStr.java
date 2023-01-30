package task0906;

public class ExampleFormatStr {


    public static void main(String[] args) {
        for (int i = -5; i < 10; i++) {

            String strBinary = String.format("%16s", Integer.toBinaryString(getPowerOfTwo(i))).replaceAll(" ", "0");
            String strPower2 = String.format("%2s", i);

            System.out.println("2^" + strPower2 + " = " + strBinary);
        }
    }

    public static int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power; // -- Этого не понял

            /* TODO - ask Den return 1 >> -power; =========== ????*/
        }
    }
}
