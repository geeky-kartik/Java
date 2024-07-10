package BST;

public class SearchUsingRecursion {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static boolean isExist(TreeNode root, int target) {
        if (root == null) return false;
        if (root.val == target) return true;

        if(target > root.val) {
            return isExist(root.right, target);
        }
        else {
            return isExist(root.left, target);
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

        System.out.println(isExist(a, 18)); // Should return false
        System.out.println(isExist(a, 8));  // Should return true
    }
}
