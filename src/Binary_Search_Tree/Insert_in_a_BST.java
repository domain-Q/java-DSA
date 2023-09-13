package Binary_Search_Tree;

public class Insert_in_a_BST {
    public class Node {
        int val;
        Node left;
        Node right;
        Node(){

        }

        Node(int val) {
            this.val = val;
        }


        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        class solution {
            public Node Insert(Node root, int val) {
                if (root == null) {
                    return new Node(val);

                }
                if (val > root.val) {

                    root.right = Insert(root.right, val);
                } else {
                    root.left = Insert(root.left, val);
                }
                return root;
            }
        }
    }
}
