package Graph;

import java.util.*;

public class Adjacent_list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of vertices
        int m = sc.nextInt(); // number of edges

        // Create an array of ArrayList
        ArrayList<Integer>[] adj = new ArrayList[n + 1];

        // Initialize each list
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Read edges
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int u = sc.nextInt();

            // Since undirected graph: add both ways
            adj[v].add(u);
            adj[u].add(v);
        }

        // Print adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int node : adj[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// 1D array
// [1] [2,3] -> connections between like 1 to 2 1 to 3
// [2] [1,3,4]
// [3] [1,2,4]
// [4] [2,3,5]
// [5] [4,6]
    // [6] [5,2]
