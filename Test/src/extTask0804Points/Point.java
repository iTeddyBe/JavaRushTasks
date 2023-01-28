package extTask0804Points;

public class Point {
    public int x;
    public int y;
    public int color;
    public static int staticX;
    //https://goo-gl.me/GkHAP
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public void print(String num) {
        System.out.println("point[" + num + "]: x=" + x + ANSI_BLUE+" staticX=" + staticX +ANSI_RESET+ " y=" + y + " color=" + color);
    }

    public static void staticPrint(String num){
        //System.out.println("point[" + num + "]: x=" + x + " staticX=" + staticX + " y=" + y + " color=" + color);
        // === Только static перепенные могут быть использованы в static методе
        System.out.println("point[" + num + "]: "+ANSI_BLUE+"staticX=" + staticX);
    }

    static {
        // === Блок инициализации static переменных класса
        // Если отсутствует - static поля заполнятся значениями по умолчанию (int = 0)
        staticX = 10;
    }
}
