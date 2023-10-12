package Recursion;

public class printPermutation {
    public static void main(String[] args) {
    String str = "abc";
        System.out.println(permutation(str,""));
    }
    public static int permutation(String ques, String ans){
        if ( ques.length()==0){
            System.out.println(ans);
            return 1;
        }
        int count =0;
        for ( int i = 0; i<ques.length();i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i + 1);
           count+= permutation(s1+s2, ans +ch);
        }
        return count;
    }
}
