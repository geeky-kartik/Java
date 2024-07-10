package Conditionals;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            System.out.println("Digit = " + rem);
            n = n / 10;
        }
        System.out.println("Number of digits = " + count);
    }


}
