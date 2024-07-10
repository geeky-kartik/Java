package StacksInJava;

public class LinkListImplementation {
    public static class Node { //User defined data type
        private final int val;
        private Node next;

        public Node(int x) {
            this.val = x;
        }
    }

    public static class Stack { //User defined data Structure
        Node head = null;
        int size = 0;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRec(Node h) {
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");

        }
        void display() {
            displayRec(head);
            System.out.println();
        }
        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        int  size() { //getter
            return size;
        }

        boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();

        st.pop();

        st.display();
    }
}
