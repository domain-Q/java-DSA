package Binary_Search;

import java.util.Scanner;

public class search_ceil_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ceil = FindCeil(arr, target);

        if (ceil != -1) {
            System.out.println("Ceil of " + target + " is: " + ceil);
        } else {
            System.out.println("No ceil found for " + target);
        }
    }
    public static int FindCeil(int arr[], int target){
     int start =0;
     int end = arr.length -1;
     int ceil = -1;
     while ( start <= end ){
          int mid = start + (end - start )/2;
          if (arr[mid ]== target){
              return arr[mid];
          } else if (arr[mid]< target) {
             start = mid +1;
          }
          else {
              ceil= arr[mid];
              end = mid -1;
          }
     }

        return ceil;
    }

}
