package LearnArrays;

import java.util.Scanner;

public class LinearSearch {
    static void searchElement(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i+1));
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not found!");
        }
    }
    public static void main(String[] args) {
        int[] array = {12,34,76,18,92,10,27,44,145,75};
        int key = 19;

        searchElement(array, key);

    }
}
