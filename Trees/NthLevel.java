package Trees;

import java.io.PrintStream;
import java.util.Scanner;

public class NthLevel {

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    static int n;
    public static void printNodes(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == n) {
            System.out.print(root.val + " ");
        }
        printNodes(root.left, level + 1); // left subtree
        printNodes(root.right, level + 1);  // right subtree
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  //a is the root

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; e.right = i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
       printNodes(a, 0);
    }
}

