package task8;

import java.util.Scanner;

public class Sample6 {

    public static void main(String[] args) {

        long z = 1;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the NUmber :");
        int x =  s.nextInt();

        for (int i = x; i > 0; i--) {
            z = z * i;
        }
        System.out.println(z + " is a Factorial of " + x);
    }
}
