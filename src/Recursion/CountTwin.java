package Recursion;

import java.util.Scanner;

public class CountTwin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Twins(str,0));

    }
    public static int Twins(String str, int index){
        if ( index >=str.length()-2){
            return 0;
        }
        if (str.charAt(index)==str.charAt(index+2)){
          return 1+Twins(str,index+1);
        }
            return Twins(str,index+1);
    }
}
