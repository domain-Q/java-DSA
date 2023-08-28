package Binary_Search;

import java.util.Scanner;

public class MinimumDifferenceElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int result = diff(arr, target);

        System.out.println("Element with minimum absolute difference: " + result);
    }

    public static int diff(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // After binary search, start and end point to the elements closest to the target
        if (start > 0 && end < arr.length) {
            if (Math.abs(arr[start] - target) < Math.abs(arr[end] - target)) {
                return arr[start];
            } else {
                return arr[end];
            }
        } else if (start > 0) {
            return arr[start];
        } else {
            return arr[end];
        }
    }
}
