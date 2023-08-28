package Binary_Search;

import java.util.Scanner;

public class search_floor_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for( int i =0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
       int floor =  findFloor(arr, target);

        if (floor != -1) {
            System.out.println("Floor of " + target + " is: " + floor);
        } else {
            System.out.println("No floor found for " + target);
        }

    }
        public static int findFloor(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            int floor = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return arr[mid]; // Exact match, so the element itself is the floor
                } else if (arr[mid] < target) {
                    floor = arr[mid]; // Update the potential floor and search in the right half
                    left = mid + 1;
                } else {
                    right = mid - 1; // Search in the left half
                }
            }

            return floor;
        }

}
