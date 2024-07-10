package LearnArrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 0, 12, 33, 9, 2, 1, 6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
