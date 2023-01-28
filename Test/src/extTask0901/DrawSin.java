package extTask0901;

public class DrawSin {
    public static int N = 50;

    public static void drawValue(double y) {
        int value = (int) (y * N) + (N) / 2;

        for (int i = 0; i < N; i++) {
            char c = (i == N / 2) ? '|' : '.';
            if (i == value)
                c = '*';
            System.out.print(c);
        }

        System.out.println("...");
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            String beginLine = ((i + 1) < 100) ? ((i + 1) < 10 ? "00" : "0") : "";
            System.out.print(beginLine + (i + 1) + " ...");
            double x = i * Math.PI * 2 * (1 + 1.0 / N) / N;
            // (1 + 1.0/N) = ~1% - correction for symmetry for center in last line
            // 2 * PI = 1 full circle of sin()
            // 4 * PI = 2      circle of sin()
            double y = Math.sin(x) / 2;
            drawValue(y);
        }
    }

}
