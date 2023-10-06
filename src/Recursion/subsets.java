package Recursion;

import java.util.*;

public class subsets {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int N = scanner.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int target = scanner.nextInt();
            System.out.println("\n" + printsubset(arr, target, 0, ""));
            ;

        }

       public static int printsubset(int[] arr, int target, int index, String ans) {
            if (target == 0) {
                System.out.print(ans + " ");
                return 1;
            }
            if (index == arr.length) {
                return 0;
            }
            int count = 0;
            count += printsubset(arr, target - arr[index], index + 1, ans + arr[index] + " ");
            count += printsubset(arr, target, index + 1, ans);

            return count;
        }
    }
