package Trees;


public class NodeOfTree {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int x) {
            this.val = x;
        }

    }
    private static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");

        display(root.left); //left subtree
        display(root.right);  //right subtree
    }
    public static void main(String[] args) {
        Node a = new Node(1);  //a is the root

        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

//        System.out.println(a.left.val);
//        System.out.println(a.left.left.val);
//        System.out.println(a.left.right.val);

        display(a);
    }
}
