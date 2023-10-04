package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number");
        int n = sc.nextInt();
        System.out.println("The Fibonacci of the "+n+ "  is "+ fib(n) );
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        return f1 + f2;
    }


}
