package task8;

import java.util.Scanner;

public class Sample4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long y = s.nextLong();

        long z = x + y;
             x = z - x;
             y = z - y;

        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
