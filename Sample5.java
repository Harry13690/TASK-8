package task8;

import java.util.Scanner;

public class Sample5 {

    public static void main(String[] args) {

        int c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n ; i++) {
            if (n % i == 0)
                c++;
        }

        if (c == 0){
            System.out.println(n + "is a prime number");
        }
        else {
            System.out.println(n + "is a not prime number");
        }
    }
}












