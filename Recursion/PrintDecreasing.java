package Recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void printNum (int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printNum(num);
    }

}
