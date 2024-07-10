package LL_Questions;



// Node class definition
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// SinglyLL (Singly Linked List) class definition
class SinglyLL {
    Node head;

    // Constructor to initialize the linked list
    public SinglyLL() {
        this.head = null;
    }

    // Method to insert a node at the end of the list
    public void InsertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to find the size of the linked list
    public int sizeOfLL() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Method to find a node by value
    public Node findNode(int val) {
        Node current = head;
        while (current != null && current.val != val) {
            current = current.next;
        }
        return current;
    }
}

// DeleteNode class definition
public class DeleteNode {
    public void deleteNode(Node node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Node to be deleted cannot be null and must not be the tail node.");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);
        list.displayLL();

        System.out.println("Length of LL: " + list.sizeOfLL());

        Node nodeToDelete = list.findNode(30); // Find the node with value 30
        if (nodeToDelete != null && nodeToDelete.next != null) {
            DeleteNode dl = new DeleteNode();
            dl.deleteNode(nodeToDelete); // Delete the node
        } else {
            System.out.println("Node to delete is not found or it is the last node.");
        }

        list.displayLL(); // Display the list after deletion
    }
}
