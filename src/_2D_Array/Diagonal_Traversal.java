package _2D_Array;

import java.util.Scanner;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n]; //input lene ke liye hai ye poora
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int g = 0; g < arr.length; g++) {  // isme gap 0 se start hoke arary  ke length tak jara hai
            for (int i = 0, j = g; j < arr.length; i++, j++) { // isme j gap ke baraabar hai aur tabtak chalega jabtak j length ke barabar nahi ho jaata hai.
                System.out.println(arr[i][j]);
            }
        }
    }
}
