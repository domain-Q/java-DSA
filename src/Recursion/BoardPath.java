package Recursion;

import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("now enter the size of the board");
        int n = sc.nextInt();
        System.out.println("enter the number of dice faces");
        int m = sc.nextInt();

        System.out.println("\n"+PrintAns(n,0, "",m));

    }
    public static int PrintAns(int Size, int curr, String ans, int val){
        if ( curr > Size){
            return 0;
        }
        if ( curr == Size){
            System.out.print(ans+" ");
            return 1;
        }
        int count = 0;
        for ( int dice = 1; dice <= val; dice++){
           count= count + PrintAns(Size, curr+dice, ans +dice,val);
        }
        return count;
//        PrintAns(Target, curr+1, ans +1);
//        PrintAns(Target, curr+2, ans +2);
//        PrintAns(Target, curr+3, ans +3);
    }
}
