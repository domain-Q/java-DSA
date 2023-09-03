package Tree;

public class Diameter_of_a_binary_tree {
    public class TreeNode{
        int val;
        TreeNode left ;
        TreeNode right;
        TreeNode(){

        }
        TreeNode( int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this .right = right;
        }
    }
    class Solution {
        public int DiameterOfBinaryTree( TreeNode root){
            return Diameter(root).d;
        }
    }
    class DiaPair{
        int d = 0;
        int ht = -1;
    }

   public DiaPair Diameter(TreeNode root) {
        if (root == null){
            return new DiaPair();
        }
        DiaPair ldp = Diameter( root.left);
        DiaPair rdp = Diameter(root.right);
        int dp = ldp.ht + rdp.ht +2;
        DiaPair sdp = new DiaPair();
        sdp.d = Math.max(dp, Math.max(ldp.ht,rdp.ht));
        sdp.ht = Math.max(ldp.ht, rdp.ht)+1;
        return sdp;
    }


}
