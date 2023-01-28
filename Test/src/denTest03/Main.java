package denTest03;

import denTest03.entities.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Vehicle car1 = Vehicle.builder().a(3).b(5).model("BMW").a(10).build();
        System.out.println(car1.getA());

        car1.setA(9);
        car1.setModel("BMW");

        Vehicle car2 = Vehicle.builder().b(2).build();
        System.out.println(car2);

        System.out.println(car1);
        String string = br.readLine();

//        if ("One".toLowerCase() == "one".toLowerCase()) {
//            System.out.println("true");
//        } else System.out.println("false");
    }
}
