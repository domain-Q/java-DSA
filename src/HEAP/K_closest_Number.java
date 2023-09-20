package HEAP;

import java.security.KeyPair;
import java.util.*;

public class K_closest_Number {
  public static List<Integer> findClosestNumber(int arr[], int k , int target){
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) ->Integer.compare(b,a));
      for ( int num : arr){
          maxHeap.offer(num);
          if ( maxHeap.size()> k){
              maxHeap.poll();
          }
      }
      if ( maxHeap.size()> k){
          maxHeap.poll();
      }
      List<Integer> result = new ArrayList<>();
      while( !maxHeap.isEmpty()){
          result.add(maxHeap.poll());
      }
      Collections.reverse(result)
;
      return result;
  }

    public static void main(String[] args) {
        int arr []={10, 15, 7, 3, 4};
        int K= 2;
        int target = 7;
        List<Integer> closestNumbers = findClosestNumber(arr, K,target);
        System.out.println("k closest numbers is : "+closestNumbers);
    }
}
