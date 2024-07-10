package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print(fibo(num));
    }

    private static int fibo(int num) {
        if (num <= 1) {
            return num;
        }
        return fibo(num - 1) + fibo(num - 2);
    }
}
