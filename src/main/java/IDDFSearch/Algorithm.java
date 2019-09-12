package IDDFSearch;

import java.util.Stack;

public class Algorithm {
    private Node targetVertex;
    private volatile boolean isTargetFound;

    public Algorithm(Node targetVertex){
        this.targetVertex = targetVertex;
    }

    public void runDeepeningSearch(Node rootVertex){
        int detpth = 0;
        
        while(!isTargetFound){
            System.out.println();
            iddfs(rootVertex, detpth);
            detpth ++;
        }
    }

    private void iddfs(Node sourceVertex, int detpthLevel) {
        Stack<Node> stack = new Stack<>();
        sourceVertex.setDepthLevel(0);

        stack.push(sourceVertex);

        while (!stack.isEmpty()){
            Node actualNode = stack.pop();
            System.out.print(actualNode+"");

            if(actualNode.getName().equals(this.targetVertex.getName())){
                System.out.println("\nTarget Node has been found: " + this.targetVertex.getName());
                this.isTargetFound = true;
                return;

            }

            if(actualNode.getDepthLevel() >= detpthLevel){
                continue;
            }

            for (Node node: actualNode.getAdjacenciesList()){
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }
        }

    }
}
