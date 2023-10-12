package Binary_Search;

public class searchMinimumWithAPI_method {
    public static boolean Can_min(int [] arr, int mid) {


        for(int i=0; i<arr.length;i++) {

            if(arr[i]<mid) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        int [] arr= {12,4,3,4,5,1};

        int low=1;
        int high=(int)(100);

        int ans=-1;
        while(low<high) {

            int mid= (low+high)/2;


            if(Can_min(arr, mid)==false) {
                high=mid-1;
            }else {
                ans=mid;
                low=mid+1;
            }
        }

        System.out.println(ans);
    }

}

