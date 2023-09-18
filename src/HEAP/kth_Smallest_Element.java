package HEAP;

import java.util.*;

public class kth_Smallest_Element {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, };
        int k = 3;
        System.out.println(smallest(arr, k));
    }

    public static int smallest(int[] arr, int k) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxh.add(arr[i]);
            if (maxh.size() > k) {
                maxh.poll();
            }
        }
        return maxh.peek();
    }
}
