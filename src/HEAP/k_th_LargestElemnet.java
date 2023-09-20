package HEAP;

import java.util.PriorityQueue;

public class k_th_LargestElemnet {
    public static void main(String[] args) {

        int[] arr = { 2, 8, 7};
        int k = 2;
        System.out.println(smallest(arr, k));
    }

    public static int smallest(int arr[], int k){
        PriorityQueue<Integer> minh = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minh.offer(arr[i]);
        }
        for ( int i = k ; i< arr.length; i++){
            if (minh.peek()< arr[i]) {
                    minh.poll();
                    minh.add(arr[i]);
            }
        }
        return minh.peek();
    }
}
