package Tree;

public class LowestCommonAncestor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    class Solution {

    }

    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {  // agar root hi p and q doono ho toh aise me root hi hoga LCA ;
            return root;
        }

        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if (left != null && right != null) { // agar dono me p and q hai to aise me hume ye karna hai ki root return karna hai;
            return root;
        } else if (left == null) {          // agar left null hai iska matlab ki right me ek address return karna hai so return right;
            return right;
        } else {
            return left;                    // agar right null hai to iska matlab hai ki left me address return karna hai aur isiliye return left;
        }
    }
}
