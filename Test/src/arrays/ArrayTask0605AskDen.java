package arrays;


public class ArrayTask0605AskDen {

    public static void main(String[] args) {
        int[] array = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 1};
        System.out.println(getLineNumber() + array);
        printArray(array);
        System.out.println(getLineNumber() + array);
        reverseArray(array);
        System.out.println(getLineNumber() + array);
        printArray(array);
    }

    public static void reverseArray(int[] arrayParam) {
//        int[] arrayTmp = new int[arrayParam.length];
//        for (int i = 0; i < arrayParam.length; i++) {
//            arrayTmp[i] = arrayParam[arrayParam.length - 1 - i];
//        }
        int lengthArr = arrayParam.length;

        for (int i = 0; i <= arrayParam.length / 2; i++) {
            int tmpCell = arrayParam[lengthArr - 1 - i];
            arrayParam[lengthArr - 1 - i] = arrayParam[i];
            arrayParam[i] = tmpCell;
        }

//        for (int i = 0; i < arrayParam.length; i++) {
//            arrayParam[i] = arrayTmp[i];
//        }
        // === Код ниже - передается ссылка на массив, и хотя мы присвоили ссылке ссылку - на выходе ссылка
        // не изменилась (ссылка на аргумент не меняется)
        System.out.println(getLineNumber() + arrayParam);
//        arrayParam = arrayTmp;
        System.out.println(getLineNumber() + arrayParam);
//        System.out.println(getLineNumber() + arrayTmp);
        printArray(arrayParam);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static String getLineNumber() {
        return "line(" + Thread.currentThread().getStackTrace()[2].getLineNumber() + ") = ";
    }


}
