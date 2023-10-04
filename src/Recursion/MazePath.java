package Recursion;

public class MazePath {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(printPath(0,0,n-1,m-1,""));
    }
    public static int printPath( int cc, int cr, int ec, int er, String ans){
        if ( cc== er && cr == ec){
            System.out.println(ans);
            return 1;
        }
        int count =0;

        if ( cc <ec || cr<er){
            count = count +printPath(cc+1,cr,ec,er, ans+"H");
            count = count + printPath(cc,cr+1,ec,er, ans+"V");
            count = count + printPath(cc+1,cr+1,ec,er, ans+"D");
        }
        return count;

    }
}
