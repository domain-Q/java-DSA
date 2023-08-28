package _2D_Array;

import java.util.Scanner;

public class lower_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr =new int[n][n];
        for ( int i= 0 ;i< arr.length; i++){
            for ( int j =0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for ( int i= 0 ;i< arr.length; i++){
            for ( int j =0; j<arr[0].length; j++){
               while (j< i&& arr[i][j]!=0){
                   System.out.print("false");
                   break;
               }
                System.out.print("true");
               break;
            }
        }
    }
}
