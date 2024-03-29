package A_Search;

import IDDFSearch.Node;

public class ANode {

    // how far away that node is from the starting point
    private int g;

    // how far away that node is from the end node
    private int h;
    private int rowIndex;
    private int colIndex;

    //previous nod
    private ANode predecessor;
    //the node may be an obstacle/block
    private boolean isBlock;

    public ANode(int rowIndex, int colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public int getF() {
        return this.g + this.h;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }

    public ANode getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(ANode predecessor) {
        this.predecessor = predecessor;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    @Override
    public boolean equals(Object node2) {
        ANode otherANode = (ANode) node2;
        return this.rowIndex == otherANode.getRowIndex() && this.colIndex == otherANode.getColIndex();
    }

    @Override
    public String toString() {
        return "Node (" + this.rowIndex + ";" + this.colIndex + ") h:" + this.h + "- g:" + this.g + " - f=" + this.h + this.g
    }

}
