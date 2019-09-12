package BreadFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public void bfs(Vertex_B root) {
        Queue<Vertex_B> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex_B actualVertexB = queue.remove();
            System.out.println(actualVertexB.getData() + ",");

            for (Vertex_B v : actualVertexB.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }


    }
}
