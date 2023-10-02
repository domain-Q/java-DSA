package Recursion;

public class calculate_Power {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(power(a,b));

    }
    public static int power( int a, int b){
        if ( b == 1){
            return a;
        }
        //recursive call
        int ans = power(a,b-1);

        // self work
        return ans *a;
    }
}
