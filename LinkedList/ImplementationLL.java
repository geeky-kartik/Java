package LinkedList;

public class ImplementationLL {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        System.out.println("Inserting at the end:");
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);
        list.displayLL();

        System.out.println("Length of LL: " + list.sizeOfLL());
        System.out.println();

        System.out.println("Inserting at the beginning:");
        list.InsertAtBeginning(100);
        list.InsertAtBeginning(90);
        list.InsertAtBeginning(80);
        list.displayLL();

        System.out.println("Length of LL: " + list.sizeOfLL());
        System.out.println();

        System.out.println("Inserting at specific indexes:");
        list.InsertAt(2, 70);
        list.InsertAt(3, 60);
        list.InsertAt(11, 1001); // This should print "Index out of bounds"
        list.displayLL();

        System.out.println("Length of LL: " + list.sizeOfLL());
        System.out.println();

        System.out.println("Getting element at index 4:");
        System.out.println(list.getElement(4));
        System.out.println();

        System.out.println("Setting element at index 3 to 101:");
        list.set(3, 101);
        list.displayLL();
        System.out.println();

        System.out.println("Deleting head:");
        list.DeleteAtHead();
        list.displayLL();
        System.out.println("Length of LL: " + list.sizeOfLL());
        System.out.println();

        System.out.println("Deleting tail:");
        list.DeleteAtTail();
        list.displayLL();
        System.out.println("Length of LL: " + list.sizeOfLL());
        System.out.println();

        System.out.println("Deleting at index 2:");
        list.DeleteAt(2);
        list.displayLL();
        System.out.println("Length of LL: " + list.sizeOfLL());
        System.out.println();
    }
}
