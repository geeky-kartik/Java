package Trees;

public class LevelOfBT {
    //Size of a Binary tree = Number of nodes

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    static int level(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);

        int count = 1 + Math.max(leftLevel , rightLevel);
        return count;

    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  //a is the root

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(15);
        TreeNode h = new TreeNode(9);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;
        f.right = g;
        f.left = h;

        System.out.println(level(a));
    }
}
