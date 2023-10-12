package Binary_Search;
import java.util.*;

public class murthal_paratha {
    public static boolean  can_possible(int [] arr, int p, int mid){

        int TotalParatha=0;


        for(int i=0; i<arr.length;i++){

            int time=0;
            int personalParatha=1;
            while(time+ personalParatha*arr[i]<= mid){
                TotalParatha++;
                time+= personalParatha*arr[i];
                personalParatha=personalParatha+1;
            }
        }

        if(TotalParatha>=p){

            return true;
        }else{

            return false;
        }

    }
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

        int P= s.nextInt();

        int n= s.nextInt();

        int [] arr= new int [n];

        for(int i=0; i<n;i++){

            arr[i]= s.nextInt();
        }

        int low=1;

        int high= (int)(1e9);

        int ans=-1;

        while(low<=high){

            int mid= (low+high)/2;

            if(can_possible(arr, P, mid)==false){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }

        System.out.println(ans);

    }
}