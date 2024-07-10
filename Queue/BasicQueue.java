package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();   //---> same as remove()
        System.out.println(q);

        System.out.println();
        System.out.println(q.element());
        System.out.println(q.peek());  //--Same as element()

        System.out.println();
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);
        System.out.println(q.size());
    }
}
