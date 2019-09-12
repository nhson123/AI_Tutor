package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex_D {
    private String name;
    private boolean visited;
    private List<Vertex_D> neighbourlist;

    public Vertex_D(String name) {
        this.name = name;
        this.neighbourlist = new ArrayList<>();

    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex_D> getNeighbourlist() {
        return neighbourlist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourlist(List<Vertex_D> neighbourlist) {
        this.neighbourlist = neighbourlist;
    }

    public void addNeighbour(Vertex_D vertexD) {
        this.neighbourlist.add(vertexD);
    }
}
