package arrays;

import java.util.Arrays;

public class ArraysTask0607 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};

        System.out.println(Arrays.toString(array1));

        System.out.println(-4 % 2);


        int[] array2 = {};

        System.out.println(Arrays.toString(array2));

        String[] array3 = {"Hi", "Hello", "Next", "End Array"};

        System.out.println(Arrays.toString(array3));

        int[][] arrayXY= {{0, 0}, {1, 1}, {2, 2}, {3, 4}, {5, 6} };

        System.out.println(Arrays.deepToString(arrayXY)); // deepToString - для массивов размерности более 1
    }
}
