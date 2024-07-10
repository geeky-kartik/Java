package Recursion;

import java.util.Scanner;

public class PrintIncreasingM3 {
    public static void printNum (int n) {
        if(n == 0) {
            return;
        }
        printNum(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printNum(num);
    }

}
