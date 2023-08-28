package _2D_Array;

import java.util.Scanner;

public class Saddle_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][min]) {
                    min = j;
                }
            }
            boolean flag = true;
            for ( int k = 0 ; k < arr.length ; k++){
                if ( arr[k][min]> arr[i][min]){
                    flag = false;
                    break;
                }
            }
            if ( flag == true){
                System.out.println( arr[i][min]);
                return;
            }
        }
        System.out.println("invalid input");
    }
}
