package Recursion;
import  java.util.*;

public class letterCombinationOfPhoneNmber {
    static String []map={"", "abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.nextLine();
        int count =combination( ques ,"");
        System.out.println("\n"+count);
    }

    public static int combination(String ques, String ans) {
          if ( ques.length() == 0){
              System.out.print(ans+" ");
              return 1;
          }
          int count = 0;

          int num = ques.charAt(0) -'0';
          String press = map[num];
          for ( int i = 0; i< press.length(); i++){
             count += combination(ques.substring(1), ans +press.charAt(i));
          }
          return count;

    }
}
