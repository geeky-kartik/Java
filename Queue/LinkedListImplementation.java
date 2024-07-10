package Queue;

public class LinkedListImplementation {

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
            this.next = null; // Explicitly setting next to null
        }
    }

    public class QueueUsingLL {
        int size = 0;
        Node head = null;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
            } else {
                Node tempHead = head;
                while (tempHead.next != null) {
                    tempHead = tempHead.next;
                }
                tempHead.next = temp;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removedElement = head.val;
            head = head.next;
            size--;
            return removedElement;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        LinkedListImplementation outer = new LinkedListImplementation();
        QueueUsingLL q = outer.new QueueUsingLL();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        q.display(); // Display the queue

        q.remove(); // Remove an element
        q.display(); // Display the queue again

        System.out.println(q.peek()); // Peek at the front element

        System.out.println("Size = " + q.getSize()); // Print the size of the queue
    }
}
