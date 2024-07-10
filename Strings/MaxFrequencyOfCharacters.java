package Strings;

import java.util.Scanner;

public class MaxFrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        int[] frequency = new int[26]; //0-a, 1-b, 2-c.....25-z
        for (int i = 0; i < str.length() ; i++) {
            char ch  = str.charAt(i);
            int ascii = (int)ch;
            int index = ascii - 97;
            frequency[index]++;
        }
        int maxFreq = -1;
        for (int i = 0; i < frequency.length ; i++) {
            maxFreq = Math.max(maxFreq, frequency[i]);

        }
        for (int i = 0; i < frequency.length ; i++) {
            if(frequency[i] == maxFreq) {
                char alpha = (char)(i+97);
                System.out.print(alpha + " ");
            }

        }

    }
}
