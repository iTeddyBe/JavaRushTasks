package array;

public class ArrayTest {

    public static void main(String[] args) {

        // comment 123 comment 123 comment 123 comment 123 comment 123 comment AB
        int[] marks1 = new int[] {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
        int[] marks2 = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

//        ArrayCopy(marks1, marks2);
        marks2 = marks1;
        marks1[0] = 100;
        System.out.println(marks2[0]);
        for (int i = 0; i< marks2.length; i++){
            System.out.print(marks2[i]);
        }
        int a = 5;
        int b = 0;

        IntCopy(a,b);
        System.out.println(b);

        String s1 = "Hello";
        String s2 = "No";
        StrCopy(s1, s2);
        //s2 = s1;
        System.out.println(s2);
    }

    public static void ArrayCopy (int[] array1, int[] array2){
        for (int i = 0; i< array1.length; i++){
            array2[i] = array1[i];
        }


//        array2 = array1;
//        for (int i = 0; i< array2.length; i++){
//            System.out.print(array2[i]);
        //}
    }

    public static void IntCopy (int a, int b){
        b = a;
    }

    public static void StrCopy (String a, String b){
        b = a.toUpperCase();
    }

}