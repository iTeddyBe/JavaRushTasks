package arrays;

public class ArrayTask0605AskDen {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        System.out.println("line(" + Thread.currentThread().getStackTrace()[1].getLineNumber() + ") = " + array);
        reverseArray(array);
        System.out.println("line(" + Thread.currentThread().getStackTrace()[1].getLineNumber() + ") = " + array);
        printArray(array);
    }


    public static void reverseArray(int[] array) {
        int[] arrayTmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayTmp[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
//            array[i] = arrayTmp[i];
        }
        // === Код ниже - передается ссылка на массив, и хотя мы присвоили ссылке ссылку - на выходе ссылка
        // не изменилась (ссылка на аргумент не меняется)
        System.out.println("line(" + Thread.currentThread().getStackTrace()[1].getLineNumber() + ") = " + array);
        array = arrayTmp;
        System.out.println("line(" + Thread.currentThread().getStackTrace()[1].getLineNumber() + ") = " + array);
        System.out.println("line(" + Thread.currentThread().getStackTrace()[1].getLineNumber() + ") = " + arrayTmp);
        System.out.println("=== ask Den");
        printArray(array);
        System.out.println("=== ask Den");
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
