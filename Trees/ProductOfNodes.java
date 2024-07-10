package Trees;

public class ProductOfNodes {

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public static int  product(TreeNode root) {

        if (root == null || root.val == 0 ) { //To skip the non zero element
            return 1;
        }

        int ans = root.val * product(root.left) * product(root.right);
        return ans;
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

        System.out.println(product(a));
    }
}

