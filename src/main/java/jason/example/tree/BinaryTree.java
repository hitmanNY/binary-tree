package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;

public class BinaryTree {
    BinaryTreeNode node;

    public BinaryTree() {
        node = null;
    }

    public BinaryTree(Integer data) {
        node = insert(node, data);
    }

    public BinaryTreeNode insert(Integer data) {
        node = insert(null, data);
        return node;
    }

    public BinaryTreeNode insert(BinaryTreeNode node, Integer data) {
        if (node == null) {
            node = new BinaryTreeNode(data);
        }
        else if (data < node.getData()) {
            node.setLeftNode(insert(node.getLeftNode(), data));
        }
        else if (data > node.getData()) {
            node.setRightNode(insert(node.getRightNode(), data));
        }
        return node;
    }

    public Integer min(BinaryTreeNode node) {
        System.out.println("Checking Left Node Value=" + node.getData());
        if (node.getLeftNode() != null) {
            return min(node.getLeftNode());
        }

        return node.getData();
    }

    public Integer max(BinaryTreeNode node) {
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

    public Integer size(BinaryTreeNode node) {
        Integer count = 0;

        if (node == null) {
            count = 0;
        }

        else {
            count = 1 + size(node.getLeftNode()) + size(node.getRightNode());
        }

        return count;
    }
}
