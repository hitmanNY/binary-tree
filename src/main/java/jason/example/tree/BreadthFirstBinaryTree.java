package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstBinaryTree extends BinaryTree {
    public void printBreadthFirstOrder(BinaryTreeNode node) {

        if (node == null) {
            return;
        }

        // create new Q and add node in q to get party started
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(node);

        while (!queue.isEmpty()) {
            BinaryTreeNode currentNode = queue.remove();
            printNodeValue(currentNode);

            if (currentNode.getLeftNode() != null) {
                queue.add(currentNode.getLeftNode());
            }

            if (currentNode.getRightNode() != null) {
                queue.add(currentNode.getRightNode());
            }
        }
    }
}
