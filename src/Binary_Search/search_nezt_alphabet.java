package Binary_Search;

import java.util.Scanner;

public class search_nezt_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        char target = sc.next().charAt(0);


        char alpha = alphabet(arr, target);

        if (alpha != 0) {
            System.out.println("Next alphabet element after " + target + " is: " + alpha);
        } else {
            System.out.println("No next alphabet element found after " + target);
        }
    }
    public static char alphabet(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;
        char alpha = 0; // Initialize with 0, which represents no valid alphabet element

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                alpha = arr[mid];
                end = mid - 1;
            }
        }

        return alpha;
    }
}
