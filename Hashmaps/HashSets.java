package Hashmaps;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //inserting elements - TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);

        System.out.println(set);

        //search
        System.out.println(set.contains(10));
        System.out.println(set.contains(50));
        System.out.println("Size of the set: " + set.size());

        System.out.println("After removing 100: ");
        set.remove(100);
        System.out.println(set);
        System.out.println("Size of the set: " + set.size());

        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        


    }
}
