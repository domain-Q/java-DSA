package Tree;
// given the root of binary tree and integer target sum , return true if the tree has a root to leaf path sucnn thataddunf uo all the valurs aling the path equals
public class pathSum {
    public class TreeNode {
        int val;
        SymetricTree.TreeNode left;
        SymetricTree.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, SymetricTree.TreeNode left, SymetricTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null) {
                return targetSum - root.val == 0;
            }
            boolean left = hasPathSum(root.left, targetSum - root.val);
            boolean right = hasPathSum(root.right, targetSum - root.val);
            return left || right;
        }

    }
}
