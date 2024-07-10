package Recursion;

import java.util.Scanner;

public class LogarithmicPowerFunc {

    public static int pow(int a, int b) {

        if (b == 0) {
            return 1;
        }
        int ans = pow(a, b/2);
        if (b % 2 == 0) {       //for even powers
            return ans * ans;
        }
        else {                  //for odd powers
            return ans * ans * a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();

        int ans = pow(a, b); //calculates a raised to the power b
        System.out.println(a + " ^ " + b + " = " + pow(a, b));
    }
}
