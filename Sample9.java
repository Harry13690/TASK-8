package task8;

import java.util.Scanner;

public class Sample9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int x = s.nextInt();

        if (x >= 60 && x < 80) {
            System.out.println("The Person is Senior Citizen");
        }
        else if (x >= 80) {
            System.out.println("The Person is Super Senior Citizen");
        }
        else {
            System.out.println("The Person is not a Senior Citizen");
        }
    }
}
