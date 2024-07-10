package Strings;

import java.util.Scanner;

public class UpdateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        //Update all the even positions of the String to 'a'

        //Method - 1
        System.out.println("Method - 1");
        String str2 = "";

        for (int i = 0; i < str.length() ; i++) {
            if(i % 2 == 0) {
                str2 = str2 + 'a';
            }
            else {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println("Updated String: " + str2);

        //Method - 2
        System.out.println("Method - 2");
        StringBuilder newString =  new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                newString.setCharAt(i, 'a');
            }
        }
        System.out.println("Updated String: " + newString.toString());
    }
}
