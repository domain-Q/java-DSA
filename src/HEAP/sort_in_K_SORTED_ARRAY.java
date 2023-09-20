package HEAP;
import java.util.*;

public class sort_in_K_SORTED_ARRAY {
    public static List<Integer> sortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        List<Integer> sortedList = new ArrayList<>();

        // insert the first k+1 element into the min heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            minheap.offer(arr[i]);
        }
        // process the remaining elements
        for (int i = k + 1; i< arr.length; i++ ){
            sortedList.add(minheap.poll());// Remove the smallest element and add to the sorted list
            minheap.offer(arr[i]); // Insert the next element from the k-sorted array
        }
        // Pop the remaining elements from the heap and add them to the sorted list
        while(!minheap.isEmpty()){
            sortedList.add(minheap.poll());
        }
        return sortedList;


    }

    public static void main(String[] args) {
        int[] kSortedArray = {3, 2, 1, 4, 6, 5, 7};
        int k = 2;

        List<Integer> sortedArray = sortedArray(kSortedArray, k);

        System.out.println("Sorted Array: " + sortedArray);
    }
}

