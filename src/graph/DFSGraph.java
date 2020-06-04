package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {
    int V;
    LinkedList<Integer> adj[];

    DFSGraph(int v) {
        V = v;
        adj = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int w) {
        adj[u].add(w);
    }

    public void DFSUtil(int v, boolean[] visited){
         visited[v]=true;

        Iterator<Integer> itr= adj[v].listIterator();

        while (itr.hasNext()){

            int n= itr.next();

            if(!visited[n]){
                DFSUtil(n,visited);
            }
        }
    }

    public void DFS(int v){
        boolean visited[]= new boolean[V];

        for (int i=0;i<V;i++){
            if(!visited[v]){
                DFSUtil(v,visited);
            }
        }
    }

    public static void main(String[] args) {

    }
}
