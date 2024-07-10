package Trees;

public class MaxNode {
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    static int max(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int rootVal = root.val;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        int maxNode = Math.max(rootVal, Math.max(leftMax,rightMax));
        return maxNode;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  //a is the root

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

        System.out.println(max(a));
    }
}
