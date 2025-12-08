package BackTracking;

public class Word_Search {

    public static boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[n][m];
                    if (dfs(mat, word, i, j, 0, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] mat, String word, int i, int j, int index, boolean[][] visited) {
        int n = mat.length;
        int m = mat[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || mat[i][j] != word.charAt(index)) {
            return false;
        }

        if (index == word.length() - 1) {
            return true;
        }

        visited[i][j] = true;

        boolean found = dfs(mat, word, i + 1, j, index + 1, visited)
                || dfs(mat, word, i - 1, j, index + 1, visited)
                || dfs(mat, word, i, j + 1, index + 1, visited)
                || dfs(mat, word, i, j - 1, index + 1, visited);

        visited[i][j] = false; // backtrack

        return found;
    }

    public static void main(String[] args) {
        char[][] mat = {
            {'T', 'E', 'E'},
            {'S', 'G', 'K'},
            {'T', 'E', 'L'}
        };

        String word = "GEEK";

        if (isWordExist(mat, word)) {
            System.out.println("Word Found");
        } else {
            System.out.println("Word Not Found");
        }
    }
}
