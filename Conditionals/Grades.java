package Conditionals;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();

        if(percentage >= 81 && percentage <= 100) {
            System.out.println("A Grade");
        }
        else if(percentage >= 61 && percentage <= 80) {
            System.out.println("B Grade");
        }
        else if(percentage >= 41 && percentage <= 60) {
            System.out.println("C Grade");
        }
        else if (percentage <= 40) {
            System.out.println("Fail");

        }

    }
}
