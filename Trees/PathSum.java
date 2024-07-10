package Trees;

public class PathSum {
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public int targetVal = 0;

    public boolean calculatePathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum += root.value;

        if (root.left == null && root.right == null) { // If it's a leaf node
            if (sum == targetVal) {
                System.out.println("This is THE path");
                return true;
            }
            return false;
        }

        // Check both left and right subtrees
        return calculatePathSum(root.left, sum) || calculatePathSum(root.right, sum);
    }

    public static void main(String[] args) {
        PathSum o = new PathSum();
        o.targetVal = 26;

        // Creating a sample tree
        TreeNode treeRoot = o.new TreeNode(5);
        treeRoot.left = o.new TreeNode(4);
        treeRoot.right = o.new TreeNode(8);
        treeRoot.left.left = o.new TreeNode(11);
        treeRoot.left.left.left = o.new TreeNode(7);
        treeRoot.left.left.right = o.new TreeNode(2);
        treeRoot.right.left = o.new TreeNode(13);
        treeRoot.right.right = o.new TreeNode(4);
        treeRoot.right.right.right = o.new TreeNode(1);

        boolean result = o.calculatePathSum(treeRoot, 0);
        System.out.println("Path exists: " + result);
    }
}
