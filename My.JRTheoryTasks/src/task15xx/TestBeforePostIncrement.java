package task15xx;

import java.io.IOException;


public class TestBeforePostIncrement {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i = i + 2) {
            int tmp2 = (i + 1) - ((i + 2) * (i + 1)) - (i + 2) + 2;

            //int tmp1 = ++i - (i++ * --i) - ++i + 2;
            int tmp3 = i++ - (i++ * i--) - i++ + 2;
            //         7   - (8   * 7  ) - 8   + 2

            // =============================================

            int tmp1 = ++i - i++ * --i - ++i + 2;


            i = i + 2;
        }

    }
}

