package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    private static void displayPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        displayPreOrder(root.left); // left subtree
        displayPreOrder(root.right);  // right subtree
    }

    private static void displayPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        displayPostOrder(root.left); // left subtree
        displayPostOrder(root.right);  // right subtree
        System.out.print(root.val + " ");
    }

    private static void displayInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        displayInOrder(root.left); // left subtree
        System.out.print(root.val + " ");
        displayInOrder(root.right);  // right subtree
    }

    private static void displayLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode front = queue.remove();
            System.out.print(front.val + " ");
            if (front.left != null) queue.add(front.left);
            if (front.right != null) queue.add(front.right);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  // a is the root

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        System.out.print("PreOrder: ");
        displayPreOrder(a);
        System.out.println();

        System.out.print("PostOrder: ");
        displayPostOrder(a);
        System.out.println();

        System.out.print("InOrder: ");
        displayInOrder(a);
        System.out.println();

        System.out.print("Level Order: ");
        displayLevelOrder(a);
        System.out.println();
    }
}
