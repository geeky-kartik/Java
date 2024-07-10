package Conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price of the product: ");
        float costPrice = sc.nextFloat();
        System.out.print("Enter selling price of the product: ");

        float sellPrice = sc.nextFloat();

        if (costPrice > sellPrice) {
            System.out.println("Incurred Loss!");
            System.out.println("Total Loss incurred = " + (costPrice - sellPrice));
        }
        else {
            System.out.println("Profit Made!");
            System.out.println("Total Profit made = " + (sellPrice - costPrice));
        }
    }
}
