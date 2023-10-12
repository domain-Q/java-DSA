package Recursion;

import java.util.Scanner;

public class coinPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of an array");
        int n = sc.nextInt();
        int []coin = new int[n];
        System.out.println("enter the value of coins");
        for ( int i= 0; i< coin.length;i++){
            coin[i]= sc.nextInt();
        }
        System.out.println("total amount to fulfill");
        int amount = sc.nextInt();
        Permutation(coin,amount,"");


    }

    private static void Permutation(int[] coin, int amount, String ans) {
        if ( amount== 0){
            System.out.println(ans);
            return;
        }
        for ( int i = 0; i< coin.length; i++){
            if ( amount >= coin[i]){
                Permutation(coin,amount -coin[i],ans+coin[i]);
            }
        }

    }
}
