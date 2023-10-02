package Recursion;

public class subsequence {

        public static void main(String[] args) {
            String ques = "abc";
//            printSubsequence(ques,"");
            int count = countSubsequence(ques, "");
            System.out.println("Total Subsequences: " + count);
        }

//    static int count =0; // ye to h hai jugaad ki kuch na kucch karke kar derhe hai hum
//    public static void printSubsequence(String ques,String ans){
//        if ( ques.length()== 0){
//            System.out.println(ans);
////            count++; = add karte gaye jitne baar base case hit hota gaya
//            return;
//        }
//        char ch = ques.charAt(0);
//        printSubsequence(ques.substring(1),ans);
//        printSubsequence(ques.substring(1), ans + ch);
//    }
    public static int countSubsequence(String ques,String ans){
        if ( ques.length()== 0){
            System.out.println(ans);
//            count++;
            return 1;
        }
        char ch = ques.charAt(0);
       int a1= countSubsequence(ques.substring(1),ans);
       int a2 = countSubsequence(ques.substring(1), ans + ch);
        return a1 +a2;
    }
}
