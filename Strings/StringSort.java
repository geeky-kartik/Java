package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        String sortedString = new String(arr);

        System.out.println("Sorted string: " + sortedString);

        //for StringBuilder

        StringBuilder sb = new StringBuilder("Deshpande");
        String string = sb.toString();

        //and  follow the same process as above

    }
}
