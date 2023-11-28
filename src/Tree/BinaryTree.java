package Tree;

import java.util.*;

public class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right;

    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        root = CreateTree();

    }

    private Node CreateTree() {
        int data = sc.nextInt();
        Node nn = new Node();
        nn.val = data;
        Boolean hlc = sc.nextBoolean();
        if (hlc){
            nn.left =CreateTree();
        }
        Boolean hrc = sc.nextBoolean();
        if (hrc){
            nn.right =CreateTree();
        }
        return nn;

    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if ( nn== null){
            return;
        }
        String s ="<--"+nn.val+"-->";
        if ( nn.left!= null){
            s= nn.left.val+s;
        }
        else{
            s="."+s;
        }
        if ( nn.right != null){
            s= s+ nn.right.val;
        }
        else{
            s= s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
}
