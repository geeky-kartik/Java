package Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        //two pointer method
        int n = sb.length();
        int i = 0, j = 0;
        while (j < n) {
            if (sb.charAt(j) != ' ') {
                j++;
            }
            else {
                reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sb, i, j - 1); //for reversing the last word
        System.out.println("After reversing each word: " + sb);




    }
    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }

    }
}
