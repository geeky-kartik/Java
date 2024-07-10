package Recursion;

import java.util.Scanner;

public class NthStair {
    //Find the number of ways to reach the Nth stair given that
    //the person can only take 1 or 2 jumps at a time
    //Leetcode 70

    public static int stair (int n) {
        if ( n <= 2) {
            return n;
        }

       return stair(n - 1) +  stair(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Number of ways = " + stair(n));
    }
}
