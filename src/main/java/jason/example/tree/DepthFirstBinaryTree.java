package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;

public class DepthFirstBinaryTree extends BinaryTree {

    // Visit Node
    // Traverse Left
    // Traverse Right
    public void printPreOrder() {
        printPreOrder(this.node);
    }

    private void printPreOrder(BinaryTreeNode node) {

        if (node == null) {
            return;
        }

        printNodeValue(node);

        if (node.getLeftNode() != null) {
            printPreOrder(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            printPreOrder(node.getRightNode());
        }
    }

    // Traverse Left
    // Visit Node
    // Traverse Right
    public void printInOrder() {
        printInOrder(node);
    }

    private void printInOrder(BinaryTreeNode node) {

        if (node == null) {
            return;
        }

        if (node.getLeftNode() != null) {
            printInOrder(node.getLeftNode());
        }

        printNodeValue(node);

        if (node.getRightNode() != null) {
            printInOrder(node.getRightNode());
        }
    }

    // Traverse Left
    // Traverse Right
    // Visit Node
    public void printPostOrder() {
        printPostOrder(node);
    }

    private void printPostOrder(BinaryTreeNode node) {

        if (node == null) {
            return;
        }

        if (node.getLeftNode() != null) {
            printPostOrder(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            printPostOrder(node.getRightNode());
        }

        printNodeValue(node);
    }
}
