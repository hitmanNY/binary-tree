package jason.example.tree.dataobject;

// Data structure to store a Binary Tree node
public class Node {
    private int data;
    private Node left = null;
    private Node right = null;

    public Node(int key) {
        this.data = key;
    }

    public Node getLeftNode() {
        return left;
    }

    public Node getRightNode() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}