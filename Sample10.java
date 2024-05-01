package task8;

import java.util.Scanner;

public class Sample10 {

    public static void main(String[] args) {

        int count = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number :");
        long x = s.nextLong();

        while ( x != 0){
            x = x / 10;
            count++;
        }
        System.out.println(count);
    }
}






