package main;

import A_Search.AStarAlgorithm;
import BreadFirstSearch.BFS;
import BreadFirstSearch.Vertex_B;
import DepthFirstSearch.DFS;
import DepthFirstSearch.Vertex_D;
import IDDFSearch.Algorithm;
import IDDFSearch.Node;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]) {

        BFS bfs = new BFS();
        DFS dfs = new DFS();

        Vertex_B vertexB1 = new Vertex_B(1);
        Vertex_B vertexB2 = new Vertex_B(2);
        Vertex_B vertexB3 = new Vertex_B(3);
        Vertex_B vertexB4 = new Vertex_B(4);
        Vertex_B vertexB5 = new Vertex_B(5);
        Vertex_B vertexB6 = new Vertex_B(6);

        vertexB1.addNeighbourVertex(vertexB2);
        vertexB1.addNeighbourVertex(vertexB4);
        vertexB1.addNeighbourVertex(vertexB6);
        vertexB4.addNeighbourVertex(vertexB5);
        vertexB2.addNeighbourVertex(vertexB3);

        System.out.println("BFS:");
        bfs.bfs(vertexB1);

        Vertex_D vertexD1 = new Vertex_D("mot");
        Vertex_D vertexD2 = new Vertex_D("hai");
        Vertex_D vertexD3 = new Vertex_D("ba");
        Vertex_D vertexD4 = new Vertex_D("bon");
        Vertex_D vertexD5 = new Vertex_D("nam");
        Vertex_D vertexD6 = new Vertex_D("sau");
        Vertex_D vertexD7 = new Vertex_D("bay");
        Vertex_D vertexD8 = new Vertex_D("tam");

        vertexD1.addNeighbour(vertexD2);
        vertexD1.addNeighbour(vertexD4);
        vertexD1.addNeighbour(vertexD6);
        vertexD4.addNeighbour(vertexD5);
        vertexD2.addNeighbour(vertexD3);
        vertexD2.addNeighbour(vertexD8);
        vertexD8.addNeighbour(vertexD7);

        List<Vertex_D> list = new ArrayList<>();
        list.add(vertexD1);
        list.add(vertexD2);
        list.add(vertexD3);
        list.add(vertexD4);
        list.add(vertexD5);
        list.add(vertexD6);
        list.add(vertexD7);
        list.add(vertexD8);
        System.out.println("DFS:");
       dfs.dfs_iteration(list);
        //dfs.dfs_recursive(list);

        System.out.println("\nIDDFS:");

        Node vertex1 = new Node("1A");
        Node vertex2 = new Node("2B");
        Node vertex3 = new Node("3C");
        Node vertex4 = new Node("4D");
        Node vertex5 = new Node("5E");


        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex4);
        vertex3.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);

        Algorithm algorithm = new Algorithm(vertex4);
        algorithm.runDeepeningSearch(vertex1);

// A*Search
        AStarAlgorithm aStarAlgorithm = new AStarAlgorithm();
        algorithm.search();
        algorithm.showPath();

    }
}
