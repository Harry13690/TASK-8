package task8;

import java.util.Scanner;

public class Sample2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int x = s.nextInt();

        if (x % 2 == 0 ) {
            System.out.println(x + " is a even number");
        } else {
            System.out.println(x + " is a odd number");
        }
    }
}
