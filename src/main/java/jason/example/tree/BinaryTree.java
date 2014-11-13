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
            node.setRightNode(insert(node.getLeftNode(), data));
        }
        return node;
    }
}
