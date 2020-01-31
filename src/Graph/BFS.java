package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void BFS(Graph G, int s) {
        boolean visited[] = new boolean[G.V];
        LinkedList<Integer> neibors = new LinkedList<>();
        visited[s] = true;
        neibors.add(s);
        while (!neibors.isEmpty()) {
            s = neibors.poll();
            System.out.print(s + " ");
            for (int i : G.adj[s]) {
                if (!visited[i]) {
                    visited[i] = true;
                    neibors.add(i);
                }
            }
        }
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        BFS(g,2);
    }
}

