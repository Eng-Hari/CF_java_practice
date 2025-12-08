package BackTracking;

import java.util.*;

public class Word_Boggle {

    public static void main(String[] args) {
        char[][] board = {
            {'G', 'I', 'Z'},
            {'U', 'E', 'K'},
            {'Q', 'S', 'E'}
        };

        String[] dictionary = {"GEEKS", "FOR", "QUIZ", "GO"};
        Target obj = new Target();
        String[] result = obj.wordBoggle(board, dictionary);

        for (String word : result) {
            System.out.println(word);
        }
    }
}

class Target {

    public String[] wordBoggle(char board[][], String[] dictionary) {
        List<String> result = new ArrayList<>();
        int n = board.length;
        int m = board[0].length;

        for (String word : dictionary) {
            boolean found = false;
            for (int i = 0; i < n && !found; i++) {
                for (int j = 0; j < m && !found; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        boolean[][] visited = new boolean[n][m];
                        if (backtrack(board, i, j, word, 0, visited)) {
                            if (!result.contains(word)) {
                                result.add(word);
                            }
                            found = true;
                        }
                    }
                }
            }
        }

        Collections.sort(result); // Optional
        return result.toArray(new String[0]);
    }

    private boolean backtrack(char[][] board, int i, int j, String word, int index, boolean[][] visited) {
        int n = board.length;
        int m = board[0].length;

        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        // Explore all 8 directions
        boolean found = backtrack(board, i + 1, j, word, index + 1, visited)
                || backtrack(board, i - 1, j, word, index + 1, visited)
                || backtrack(board, i, j + 1, word, index + 1, visited)
                || backtrack(board, i, j - 1, word, index + 1, visited)
                || backtrack(board, i + 1, j + 1, word, index + 1, visited)
                || backtrack(board, i + 1, j - 1, word, index + 1, visited)
                || backtrack(board, i - 1, j + 1, word, index + 1, visited)
                || backtrack(board, i - 1, j - 1, word, index + 1, visited);

        visited[i][j] = false; // backtrack
        return found;
    }
}
