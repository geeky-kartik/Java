package BST;

public class SearchInBST {

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static boolean isExist(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        TreeNode temp = root;
        while (temp != null) {
            if (target > temp.val) {
                temp = temp.right;
            } else if (target < temp.val) {
                temp = temp.left;
            } else {
                return true;
            }
        }
        return false;
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
