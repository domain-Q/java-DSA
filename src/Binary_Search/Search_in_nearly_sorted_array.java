package Binary_Search;

import java.util.*;

public class Search_in_nearly_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for( int i =0; i< n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int result = Nearlysort(arr ,target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
    public static int Nearlysort( int arr[], int target){
        int start = 0;
        int end = arr.length;
        while ( start < end){
            int mid = start +(end -start)/2;

            if ( arr[mid] == target ){
                return mid;
            }
            if (arr[mid] > 0 && arr[mid-1]==target ) {
                return mid-1;
            }
            if ( arr[mid]<arr.length-1 && arr[mid +1]==target){
                return mid+1;
            } else if (target< mid) {
               end =arr[mid ]-2;
            }
            else{
                start = arr[mid+1];
            }
        }
        return -1;
    }

}
