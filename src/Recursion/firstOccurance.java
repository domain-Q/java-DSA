package Recursion;

import java.util.Scanner;

public class firstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for ( int i = 0 ;i< n; i++){
          arr[i]= sc.nextInt();
        }
        System.out.println(FirstIndex(arr , 0,3));
    }
    public static int FirstIndex( int[]arr , int i , int item){
        if (i == arr.length){
            return -1;
        }
         
        if ( arr[i]== item){
            return i;
        }
        return FirstIndex(arr, i+1, item );
    }
}
