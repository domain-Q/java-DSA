package _2D_Array;

import java.util.Scanner;

public class search_in_SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr =new int[n][n];
        for ( int i= 0 ;i< arr.length; i++){
            for ( int j =0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int  x= sc.nextInt();
        int i = 0;
        int j = arr.length-1;
        while ( j >= 0 && i< arr.length){
            if ( x== arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if (x <arr[i][j]){
                 j--;
            }else{
                i++;
            }
        }

        System.out.println("not found");

    }
}
