package Recursion;

public class PrintParenthesis {
    public static void main(String[] args) {
        int n = 3;
        printPar(n,0,0,"");

    }
    public static void printPar( int n , int open, int close, String ans ){
        if ( open == n && close == n){
            System.out.println(ans+" ");
            return;
        }
        if ( open < close|| open > n){
            return;
        }
        printPar( n, open+1, close, ans +"(");
        printPar(n, open , close +1 , ans +")");

    }
}
