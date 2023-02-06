package task0804;

public class PointsOut {

    public static void main(String[] args) {

        Point[] arrayPoints = new Point[3];

        Point singlePoint = new Point();
        singlePoint.x = 100;
        singlePoint.y = 200;
        singlePoint.color = 700;
        singlePoint.print("pointSingle");

        System.out.println("=[print - in LOOP]===========");
        for (int i = 0; i < arrayPoints.length; i++) {
            arrayPoints[i] = new Point();

            arrayPoints[i].x = (i + 1) * 2;
            //arrayPoints[i].staticX = arrayPoints[i].x; // === Более правильно обращаться к static пременной по имени класса
            Point.staticX = (i + 1) * 2;
            arrayPoints[i].y = (i + 1) * 10;
            arrayPoints[i].color = i + 500;

            arrayPoints[i].print(Integer.toString(i));
        }



        System.out.println("=[print - printPoint (method in main class - LOOP)]===========");
        printPoint(arrayPoints);
        // === .staticX - перезаписывается в любом месте
        //singlePoint.staticX = 101; // === object.staticX - можно так, но корректней по имени класса (Point.staticX)
        Point.staticX = 101;

        System.out.println("=[print - printPointUsePrintOfClass ()]===========");
        printPointUsePrintOfClass(arrayPoints);


        System.out.println("=[print - One Points Example]===========");

        singlePoint.print("pointSingle");
        Point.staticPrint("static-print");

    }

    public static void printPoint(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println("point["+i+"]: x=" + points[i].x + Point.ANSI_BLUE+ " staticX=" + points[i].staticX+ Point.ANSI_RESET+
                    " y=" + points[i].y + " color=" + points[i].color);
        }
    }

    public static void printPointUsePrintOfClass(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            points[i].print(Integer.toString(i));
        }
    }
}
