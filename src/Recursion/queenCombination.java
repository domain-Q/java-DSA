package Recursion;

import java.util.Scanner;

public class queenCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Board");
        int n = sc.nextInt();
        boolean[] board = new boolean[n];
        System.out.println("Total number of queen");
        int tq = sc.nextInt();
        Combination(board,tq,"",0,0);
    }

    public static void Combination(boolean[] board, int tq, String ans, int qpsf, int idx) {
        if (qpsf== tq){
            System.out.println(ans);
            return;
        }
        for ( int i = idx; i< board.length;i++){
            if ( board[i]== false ){
                board [i]=true;
                Combination(board,tq,ans +"b"+i+"q"+qpsf,qpsf+1,i+1);
                board[i]=false;
            }
        }
    }
}
