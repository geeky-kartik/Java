package LearnArrays;

public class MaximumValue {
    static int maxElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < (arr.length-1); i++) {
            if(arr[i+1] > arr[i]) {
                largest = arr[i+1];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] array = {12,34,76,18,92,10,27,44,145,75};
        int max = maxElement(array);
        System.out.println(max);
    }
}
