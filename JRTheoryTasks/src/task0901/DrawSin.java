package task0901;

public class DrawSin {
    public static int N = 50;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void drawValue(double y) {
        int value = (int) (y * N) + (N) / 2;

        for (int i = 0; i < N; i++) {
            char c = (i == N / 2) ? '|' : '.';
            if (i == value)
                c = '*';
            String strOut = "12";
            switch (c) {
                case '|':
                    strOut = ANSI_YELLOW + c + ANSI_RESET;
                    break;
                case '*':
                    strOut = ANSI_BLUE + c + ANSI_RESET;
                    break;
                default:
                    strOut = "" + c;
            }
            System.out.print(strOut);
        }

        System.out.println("...");
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            String beginLine = ((i + 1) < 100) ? ((i + 1) < 10 ? "00" : "0") : "";
            System.out.print(ANSI_GREEN + beginLine + (i + 1) + " " + ANSI_RESET + "...");
            double x = i * Math.PI * 2 * (1 + 1.0 / N) / N;
            // (1 + 1.0/N) = ~1% - correction for symmetry for center in last line
            // 2 * PI = 1 full circle of sin()
            // 4 * PI = 2      circle of sin()
            double y = Math.sin(x) / 2;
            drawValue(y);
        }
    }

}
