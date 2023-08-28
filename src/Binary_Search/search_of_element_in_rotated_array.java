package Binary_Search;

public class search_of_element_in_rotated_array {
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int x=0;
        int low=0, high=arr.length-1;
        int ans=0;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==x) {
                System.out.println(mid);
                return;
            }
            if(arr[mid]<=arr[high]) {
                if(arr[mid]<=x && x<arr[high]) {
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }else {
                if(arr[low]<=x && x<=arr[mid]) {
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
        }
        System.out.println(-1);


    }
}
