package Trees;

public class SizeOfBT {
    //Size of a Binary tree = Number of nodes

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    static int size(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = size(root.left);
        int rightCount = size(root.right);

        int count = 1 + leftCount + rightCount;
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

        System.out.println(size(a));
    }
}
