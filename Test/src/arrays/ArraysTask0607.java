package arrays;

import java.util.Arrays;

public class ArraysTask0607 {

    public static void main(String[] args) {
        System.out.println("-4 % 2 = " + (-4 % 2));

        int[] array1 = {1, 2, 3};

        System.out.println("array1 = "
                + array1.getClass().getTypeName() + " "
                + array1.getClass().getSimpleName() + " = " + Arrays.toString(array1));


        int[] array2 = {};

        System.out.println("array2 = " + Arrays.toString(array2));

        String[] array3 = {"Hi", "Hello", "Next", "End Array"};

        System.out.println("array3 = " + Arrays.toString(array3));

        int[][] arrayXY = {{0, 0}, {1, 1}, {2, 2}, {3, 4}, {5, 6}};

        System.out.println("arrayXY = " + Arrays.deepToString(arrayXY)); // deepToString - для массивов размерности более 1

        int[] array4 = new int[10];
        array4[0] = 11;
        array4[1] = 12;

        System.out.println("array4 = " + Arrays.toString(array4));
        System.out.println("array4 = " + Arrays.stream(array4));
    }
}
