package Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to count vowels: ");
        String str = sc.nextLine().toLowerCase();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (int i = 0; i < str.length() ; i++) {
            char currentChar = str.charAt(i);

            for(char vowel : vowels) {
                if(currentChar == vowel) {
                    count++;
                    break; // no need to check further if match found
                }
            }
            
        }
        System.out.println("Total count of vowels : " + count);

    }
}
