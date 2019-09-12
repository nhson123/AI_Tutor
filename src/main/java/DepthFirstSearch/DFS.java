package DepthFirstSearch;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex_D> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs_recusive1(Vertex_D root) {
        root.setVisited(true);
        System.out.println(root.getName());

        for (Vertex_D v : root.getNeighbourlist()) {
            if (!v.isVisited()) {
                dfs_recusive1(v);
            }
        }
    }

    public void dfs_iteration(List<Vertex_D> vertexList) {

        for (Vertex_D v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }

    private void dfsWithStack(Vertex_D v) {
        this.stack.add(v);
        v.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex_D actualVertex = this.stack.pop();
            System.out.println(actualVertex + "");

            for (Vertex_D v1 : actualVertex.getNeighbourlist()) {
                if (!v1.isVisited()) {
                    v1.setVisited(true);
                    this.stack.push(v1);
                }
            }
        }

    }

    public void dfs_recursive(List<Vertex_D> vertexList) {

        for (Vertex_D v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsWithRecursive(v);
            }
        }
    }

    private void dfsWithRecursive(Vertex_D v) {
        System.out.println(v + "");

        for (Vertex_D vertex_d : v.getNeighbourlist()) {
            if (!vertex_d.isVisited()) {
                vertex_d.setVisited(true);
                dfsWithRecursive(vertex_d);
            }
        }

    }
}
