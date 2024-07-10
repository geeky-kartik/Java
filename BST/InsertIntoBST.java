package BST;

public class InsertIntoBST {
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static TreeNode insert(TreeNode root, int element) {
        if (root == null) {
            return new TreeNode(element);
        }
        if (element > root.val) {
            root.right = insert(root.right, element);
        } else {
            root.left = insert(root.left, element);
        }
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
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

        System.out.println("Tree before insertion:");
        printTree(a);
        System.out.println();

        insert(a, 9);

        System.out.println("Tree after insertion:");
        printTree(a);
    }
}
