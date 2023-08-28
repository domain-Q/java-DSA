package Binary_Search;

import java.util.Scanner;

public class search_in_a_Infinite_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
    }
    public static int search(int arr[], int target){
        int start = 0;
        int end = 1;
        while (target > end) {
            start = end;
            end   = end *2;

        }
        while (start < end ){
             int mid = start +( end - start)/2;
             if ( arr[mid ]== target){
                 return mid;
             } else if (arr[mid]<target) {
                 start = mid +1;
             }else {
                 end = mid +1;
             }
        }return -1;

    }
}
