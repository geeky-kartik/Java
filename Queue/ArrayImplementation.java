package Queue;

public class ArrayImplementation {
    public static class QueueUsingArray {
        private int[] arr = new int[10];
        private int front = -1;
        private int rear = -1;
        private int size = 0;

        // Add an element to the queue
        void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }
            if (rear == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = val;
            size++;
        }

        // Remove an element from the queue
        int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removedValue = arr[front];
            front++;
            size--;
            if (size == 0) {
                front = -1;
                rear = -1;
            }
            return removedValue;
        }

        // Display the elements of the queue
        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Peek at the front element of the queue
        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // Get the size of the queue
        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
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

        System.out.println("Size = " + q.size()); // Print the size of the queue
    }
}
