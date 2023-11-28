package Recursion;

import java.util.*;

public class PalindromePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.nextLine();
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        pp(ques, ans, ll);
        System.out.println(ans);
    }

    public static void pp(String ques, List<List<String>> ans, List<String> ll) {
        if (ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (is_palindrome(s)) {
                ll.add(s);
                pp(ques.substring(i), ans, ll);
                ll.remove(ll.size() - 1);
            }
        }
    }

    public static boolean is_palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
