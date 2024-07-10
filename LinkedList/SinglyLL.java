package LinkedList;

public class SinglyLL {
    Node head;
    Node tail;
    int size;

    public void InsertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {   // If LL is empty
            head = temp;
            tail = temp;
        } else {  // If LL is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void InsertAtBeginning(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void InsertAt(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            InsertAtBeginning(val);
            return;
        }

        if (index == size) {
            InsertAtEnd(val);
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i < index - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    public void DeleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    public void DeleteAtTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) { // If there's only one element
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    public void DeleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            DeleteAtHead();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;

        if (temp.next == null) {
            tail = temp;
        }
    }

    public int getElement(int index) {
        if (index < 0 || index >= size) {
            throw new Error("Index out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new Error("Index out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.val = value;
        if (index == size - 1) {
            tail = temp;
        }
    }
    public Node findNode(int val) {
        Node current = head;
        while (current != null && current.val != val) {
            current = current.next;
        }
        return current;
    }

    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int sizeOfLL() {
        return size;
    }
}
