import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 45, 60, 12};

        int minValue = Arrays.stream(arr).min().getAsInt();
        int maxValue = Arrays.stream(arr).max().getAsInt();

        // Number of buckets
        int numBuckets = 3;


        int range =  (maxValue - minValue + 1) / numBuckets;

        ArrayList<Integer>[] buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : arr) {
            if (value <= minValue + range) {
                buckets[0].add(value);
            } else if (value <= minValue +  2 * range) {
                buckets[1].add(value);
            } else {
                buckets[2].add(value);
            }
        }

        for (int i = 0; i < numBuckets; i++) {
            System.out.println("Bucket " + (i + 1) + ": " + buckets[i]);
        }
    }
}
