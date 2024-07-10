package LearnArrays;

public class SecondLargest {
    static int maxElement(int[] arr) {
        int secondLargest = arr[0];
        for (int i = 0; i < (arr.length-1); i++) {
            if(arr[i+1] > arr[i]) {
                secondLargest = arr[i+1];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {12,34,76,18,92,10,27,44,145,75};
        int max = maxElement(array);
        System.out.println(max);
    }
}
