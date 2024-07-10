package LearnArrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {23, 65, 12, 6, 4, 0, 9, 1, 8, 5};

        for (int ele : arr) {
            System.out.println(ele);
        }

        int sum = 20;
        boolean found = false;

        for (int i = 0; i < arr.length - 1 && !found; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Sum found at index " + i + " and " + j);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found with the sum " + sum);
        }
    }
}
