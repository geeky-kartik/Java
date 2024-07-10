package Strings;

import java.util.Scanner;

public class ToggleChars {
    //Take string input and toggle the chars
    //Convert small letters to capital and vice versa

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() ; i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;

            if (ascii >= 65 && ascii <= 90 ) { //capital letter
                ascii += 32;

            }
            else if (ascii >= 97 && ascii <= 122 ) { //capital letter
                ascii -= 32;

            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);
            
        }
        System.out.println("Toggled String: " + sb);
    }
}
