package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    int V;
    LinkedList<Integer> adj[];

    BFSGraph(int v) {
        V = v;
        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int w) {
        adj[u].add(w);
    }

    void printBFS(int v) {

        boolean visited[] = new boolean[V];

        visited[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (queue.size() != 0) {

            v = queue.poll();
            System.out.print(v + " ");
            Iterator<Integer> itr = adj[v].listIterator();

            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }

            }


        }
    }

    public static void main(String[] args) {
        BFSGraph bfs = new BFSGraph(4);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        bfs.printBFS(2);
    }
}
