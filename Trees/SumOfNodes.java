package Trees;

public class SumOfNodes {

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static int sum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int ans = root.val + sum(root.left) + sum(root.right);
        return ans;
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

        System.out.println(sum(a));
    }
}

