package Recursion;

public class print_Increasing {
    public static void main(String[] args) {
        int n  = 1;
        increasing(n);
    }
    public static void increasing(int n ){
        while (   n> 5){
           return;
        }
        System.out.println(n);
        increasing(n+1);
        System.out.println(n);


    }

//    public static void increasing1(int n) {
//        if ( n==0){
//            return;
//        }
//        increasing1(n-1);
//        System.out.println(n);
//
//    }
}
