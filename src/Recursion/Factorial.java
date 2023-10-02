package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n= 1;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        //base case
        if (n==6){
            return 6 ;
        }
        // smaller problem
        int fn = fact(n+1); // recursion (n-1)!
        return fn*n;
    }
}
