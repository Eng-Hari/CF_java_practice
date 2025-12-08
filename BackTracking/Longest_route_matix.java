package BackTracking;

public class Longest_route_matix {

    // Wrapper class to hold result
    static class Result {

        // result is wrapper class to carry maxlen throughout recursion
        // classes are passed by reference, so we can modify it 
        int maxlen = -1;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 1, 1}
        };

        int n = mat.length;
        int m = mat[0].length;

        int xs = 0, ys = 0; // Starting point
        int xd = 2, yd = 3; // Destination point

        int result = longestPath(mat, n, m, xs, ys, xd, yd);
        System.out.println("Longest path length is: " + result);
    }

    public static int longestPath(int[][] mat, int n, int m, int xs, int ys, int xd, int yd) {
        if (mat[xs][ys] == 0 || mat[xd][yd] == 0) {
            return -1;
        }

        boolean[][] visited = new boolean[n][m];
        Result result = new Result();

        dfs(mat, visited, xs, ys, xd, yd, 0, result);

        return result.maxlen;
    }

    private static void dfs(int[][] mat, boolean[][] visited, int x, int y, int xd, int yd, int dist, Result result) {
        int n = mat.length;
        int m = mat[0].length;

        // Boundary and invalid cell checks
        if (x < 0 || y < 0 || x >= n || y >= m || mat[x][y] == 0 || visited[x][y]) {
            return;
        }

        // Reached destination
        if (x == xd && y == yd) {
            result.maxlen = Math.max(result.maxlen, dist);
            return;
        }

        visited[x][y] = true;

        // Explore all 4 directions
        dfs(mat, visited, x, y + 1, xd, yd, dist + 1, result); // right
        dfs(mat, visited, x - 1, y, xd, yd, dist + 1, result); // up
        dfs(mat, visited, x + 1, y, xd, yd, dist + 1, result); // down
        dfs(mat, visited, x, y - 1, xd, yd, dist + 1, result); // left

        visited[x][y] = false; // Backtrack
    }
}
