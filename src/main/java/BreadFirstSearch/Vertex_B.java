package BreadFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex_B {

    private int data;
    private boolean visited;
    private List<Vertex_B> neighbourList;

    public Vertex_B(int data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex_B> getNeighbourList() {
        return neighbourList;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourList(List<Vertex_B> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public void addNeighbourVertex(Vertex_B vertexB) {
        this.neighbourList.add(vertexB);
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}

