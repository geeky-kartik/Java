package LearnArrays;

public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,0,0,1,1,0,1,0,1};

        sort(arr);
    }
    static void sort(int[] arr) {
        int zeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroes++;
            }
        }
        for (int i = 0; i < zeroes ; i++) {
            arr[i] = 0;
        }
        for (int i = zeroes; i < arr.length ; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
