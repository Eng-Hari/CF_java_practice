package BackTracking;

import java.util.*;

public class RatInMaze {

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        Sol sol = new Sol();
        List<String> paths = sol.findPath(mat, mat.length);

        System.out.println("All paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}

class Sol {

    private ArrayList<String> ans;

    // Wrapper function
    public ArrayList<String> findPath(int[][] maze, int n) {
        ans = new ArrayList<>();

        if (maze[0][0] == 0) {
            return ans;
        }

        int[][] vis = new int[n][n];
        getPath(maze, n, 0, 0, "", vis);
        Collections.sort(ans);
        return ans;
    }

    // Backtracking function
    private void getPath(int[][] m, int n, int i, int j, String ds, int[][] vis) {
        // Boundary conditions and blocked/visited cell check
        if (i < 0 || j < 0 || i >= n || j >= n || vis[i][j] == 1 || m[i][j] == 0) {
            return;
        }

        // Destination reached
        if (i == n - 1 && j == n - 1) {
            ans.add(ds);
            return;
        }

        // Mark current cell as visited
        vis[i][j] = 1;

        // Explore all directions
        getPath(m, n, i + 1, j, ds + 'D', vis); // Down
        getPath(m, n, i - 1, j, ds + 'U', vis); // Up
        getPath(m, n, i, j + 1, ds + 'R', vis); // Right
        getPath(m, n, i, j - 1, ds + 'L', vis); // Left

        // Backtrack
        vis[i][j] = 0;
    }
}
