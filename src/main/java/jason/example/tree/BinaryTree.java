package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;

public class BinaryTree {
    BinaryTreeNode node;

    public BinaryTree() {
        node = null;
    }

    public BinaryTree(int data) {
        node = insert(node, data);
    }

    public BinaryTreeNode insert(int data) {
        node = insert(node, data);

        return node;
    }

    private BinaryTreeNode insert(BinaryTreeNode node, int data) {
        if (node == null) {
            node = new BinaryTreeNode(data);
        } else if (data < node.getData()) {
            node.setLeftNode(insert(node.getLeftNode(), data));
        } else if (data > node.getData()) {
            node.setRightNode(insert(node.getRightNode(), data));
        }
        return node;
    }

    public int min() {
        return min(node);
    }

    private int min(BinaryTreeNode node) {
        System.out.println("Checking Left Node Value=" + node.getData());
        if (node.getLeftNode() != null) {
            return min(node.getLeftNode());
        }

        return node.getData();
    }

    public int max() {
        return max(node);
    }

    private int max(BinaryTreeNode node) {
        System.out.println("Checking Right Node Value=" + node.getData());
        if (node.getRightNode() != null) {
            return max(node.getRightNode());
        }

        return node.getData();
    }

    public void printNodeValue(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(" " + node.getData());
        }
    }

    public int size() {
        return size(node);
    }

    private int size(BinaryTreeNode node) {
        int count = 0;

        if (node != null) {
            count = 1 + size(node.getLeftNode()) + size(node.getRightNode());
        }

        return count;
    }
}
