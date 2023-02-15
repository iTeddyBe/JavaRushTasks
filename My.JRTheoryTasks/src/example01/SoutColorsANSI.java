package example01;

public class SoutColorsANSI {

    //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println/5762502#5762502
    //https://goo-gl.me/DM5T3

    //https://goo-gl.me/bTpb8 - RU
    //https://ru.stackoverflow.com/questions/606703/%d0%9a%d0%b0%d0%ba-%d0%b8%d0%b7%d0%bc%d0%b5%d0%bd%d0%b8%d1%82%d1%8c-%d1%86%d0%b2%d0%b5%d1%82-%d0%b2%d1%8b%d0%b2%d0%be%d0%b4%d0%b8%d0%bc%d0%be%d0%b3%d0%be-%d0%b2-%d0%ba%d0%be%d0%bd%d1%81%d0%be%d0%bb%d1%8c-%d1%82%d0%b5%d0%ba%d1%81%d1%82%d0%b0

    // CRTL+click in comment for open URL in browser

    public static void main(String[] args) {
        System.out.println("https://goo-gl.me/bTpb8");

        for (int i = 0; i < 110; i++) {
            System.out.print("i= " + "\u001B[" + i + "m" + String.format("%5s", i) + "\u001B[0m ");

            if (((i + 1) % 10) == 0) {
                System.out.println();
            }
        }
    }
}
