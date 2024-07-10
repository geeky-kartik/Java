package Strings;

import java.util.Arrays;

public class MaxStringValue {
    public static void main(String[] args) {
        //Given a string array containing digits from 0 to 9
        //Return the string with max value

        String[] str = {"1018", "999", "987", "76", "876"};
        int[] arr = new int[str.length];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length ; i++) {
            int n = Integer.parseInt(str[i]);
            arr[i] = n;

            max = Math.max(max, n);
        }
        System.out.println(max);

                    //OR

//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length ; i++) {
//            max = arr[arr.length-1];
//        }

    }
}
