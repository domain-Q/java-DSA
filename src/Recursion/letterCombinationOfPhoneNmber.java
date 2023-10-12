package Recursion;

public class letterCombinationOfPhoneNmber {
    static String []map={"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        String ques = "23";
        combination( ques ,"");
        System.out.println();
    }

    public static void combination(String ques, String ans) {
          if ( ques.length() == 0){
              System.out.println(ans);
              return;
          }

          int num = ques.charAt(0) -'0';
          String press = map[num];
          for ( int i = 0; i< press.length(); i++){
              combination(ques.substring(1), ans +press.charAt(i));
          }

    }
}
