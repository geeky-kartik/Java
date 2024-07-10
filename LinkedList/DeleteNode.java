package LinkedList;

// Node class definition
//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//        this.next = null;
//    }
//}

// SinglyLL (Singly Linked List) class definition

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
