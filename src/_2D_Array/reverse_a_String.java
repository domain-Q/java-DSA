package _2D_Array;

import java.util.Scanner;

public class reverse_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whatever you want to return");
        String str =sc.nextLine() ;
        String ans ="";

        for ( int i= str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

}
