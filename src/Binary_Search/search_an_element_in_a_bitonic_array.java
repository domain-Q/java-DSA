package Binary_Search;

import java.util.Scanner;

public class search_an_element_in_a_bitonic_array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int peakElement = peak(arr);
            System.out.println("bitonic element: " + peakElement);
        }

        public static int peak(int arr[]) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (mid > 0 && mid < arr.length - 1) {
                    if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                        return arr[mid];
                    } else if (arr[mid + 1] > arr[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else if (mid == 0) {
                    if (arr[0] > arr[1]) {
                        return arr[0];
                    } else {
                        return arr[1];
                    }
                } else if (mid == arr.length - 1) {
                    if (arr[arr.length - 1] > arr[arr.length - 2]) {
                        return arr[arr.length - 1];
                    } else {
                        return arr[arr.length - 2];
                    }
                }
            }

            return -1; // If no peak element is found
        }
    }

