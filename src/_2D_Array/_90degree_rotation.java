package _2D_Array;

import java.util.Scanner;

public class _90degree_rotation {
    // to rotate the 90 degree an array you have to do
    //two things  1stly you have to transpose an array and  the 2nd one
    // you have to swap 1 d array in it line by line :: 1 2 3 4 >> 4 3 2 1


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr =new int[n][n];
        for ( int i= 0 ;i< arr.length; i++){
            for ( int j =0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for ( int i = 0; i< arr.length; i++){
            for ( int j = i;j< arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for ( int i= 0;i< arr.length; i++){
           int li = 0;
           int ri = arr[i].length-1;
           while ( li<ri){
               int temp = arr[i][li];
               arr[i][li]= arr[i][ri];
               arr[i][ri] = temp;
               li++;
               ri--;
           }
        }
        display(arr);

    }
    public static void display(int arr[][] ){
        for (int i= 0; i< arr.length; i++){
            for ( int j = 0;j< arr[0].length;j++){
                System.out.print( arr [i][j]+",");
            }
        }
    }
}
