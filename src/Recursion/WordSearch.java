package Recursion;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0;
                 j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean ans = Search(board, i, j, word, 0);
                    if (ans == true) {
                        System.out.println(ans);
                        return;

                    }
                }
            }
        }
    }

    private static boolean Search(char[][] board, int cr, int cc, String word, int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || word.charAt(idx) != board[cr][cc]) {
            return false;
        }
        board[cr][cc] = '*';
        int[] r = {-1, 1, 0, 0};
        int[] c = {0, 0, -1, 1};
        for (int k = 0; k < c.length; k++) {
            boolean ans = Search(board, cr + r[k], cc + c[k], word, idx + 1);
            if (ans == true) {
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }

}
