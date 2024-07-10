package BST;

import com.sun.source.tree.Tree;

public class MinMaxNode {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static void Traverse(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        Traverse(root.left);
        Traverse(root.right);
    }

    public static int Max(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.val;
    }

    public static int Min(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }
        TreeNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.val;

    }

    public static int MinRecursion(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return MinRecursion(root.left);
    }

    public static int MaxRecursion(TreeNode root) {
        if (root.right == null) {
            return root.val;
        }
        return MaxRecursion(root.right);
    }



    public static void main(String[] args) {

        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(19);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        Traverse(a);
        System.out.println();
        System.out.println("Max Node = " + Max(a));
        System.out.println("Min Node = " + Min(a));
        System.out.println("Min Using Recursion = " + MinRecursion(a));
        System.out.println("Max Using Recursion = " + MaxRecursion(a));

    }
}
