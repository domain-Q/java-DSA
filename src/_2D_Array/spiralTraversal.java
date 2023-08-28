package _2D_Array;

import java.util.Scanner;

public class spiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m;
        int count = 0;
        while (count < tne) {
            // left
            for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            // bottom
            for (int i = minc, j = maxr; i <= maxc && count < tne; i++) {
                System.out.println(arr[j][i]);
                count++;
            }
            maxr--;

            // right
            for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            // top
            for (int i = maxc, j = minr; i >= minc && count < tne; i--) {
                System.out.println(arr[j][i]);
                count++;
            }
            minr++;
        }
    }
}
