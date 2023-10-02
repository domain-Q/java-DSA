package Recursion;

public class print_Decreasing {
    public static void main(String[] args) {
        int n = 5;
        printDec(n);

    }

    private static void printDec(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        printDec(n - 1);
//        System.out.println(n); to print 5432112345 it means ki jaate waqt bhi print kar rhe hai aur aate time bhi
    }


}
