package Tree;

public class FlipEquivalent {

}
class solution{
public boolean flip(TreeNode root1, TreeNode root2){
    if ( root1 == null && root2== null){
        return true;
    } if (root1 == null || root2 == null ) {
        return false;
    }if(root1.val != root2.val) {
        return false;
    }
    }
}
