package task8;

import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a value :");
        int a = s.nextInt();
        System.out.println("Enter the b value :");
        int b = s.nextInt();
        System.out.println("Enter the c value :");
        int c = s.nextInt();
        System.out.println("Enter the d value :");
        int d = s.nextInt();
        int x = a+b;
        int y = c+d;

        if (x > y) {
            System.out.print("Sum of a and b is Greater than Sum of c and d");
        }
        else if (x < y){
            System.out.print("Sum of c and d is Greater than Sum of a and b");
        }
        else {
            System.out.println("Sum of a and b is Equal to Sum of c and d");
        }
    }
}

