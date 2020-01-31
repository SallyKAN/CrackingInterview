package Graph;

import java.util.Iterator;

public class DFS {
    public static void DFS(Graph g, int s) {
        boolean[] visited = new boolean[g.V];
        DFS_VISITED(g, s, visited);

    }

    public static void DFS_VISITED(Graph g, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s + " ");
//        System.out.println(g.adj[s] == null);
//        for (int i : g.adj[s]) {
//            if (!visited[i]) {
//                DFS_VISITED(g, s, visited);
//            }
//        }
        Iterator<Integer> i = g.adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFS_VISITED(g, n, visited);
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(6);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 2)");

        DFS(g, 5);
    }
}
