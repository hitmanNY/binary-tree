package jason.example.tree;

import jason.example.tree.dataobject.Node;


public class SimpleLevelOrderTraversal {
    // Function to print all nodes of a given level from left to right
    private boolean printLevel(Node root, int level) {
        // base case
        if (root == null) {
            return false;
        }

        if (level == 1) {
            System.out.print(root.getData() + " ");

            // return true if at-least one node is present at given level
            return true;
        }

        boolean left = printLevel(root.getLeftNode(), level - 1);
        boolean right = printLevel(root.getRightNode(), level - 1);

        return left || right;
    }

    // Function to print level order traversal of given binary tree
    private void levelOrderTraversal(Node root) {
        // start from level 1 -- till height of the tree
        int level = 1;

        // run till printLevel() returns false
        while (printLevel(root, level)) {
            level++;
        }
    }

    // main function
    public static void main(String[] args) {
        SimpleLevelOrderTraversal traversal = new SimpleLevelOrderTraversal();

        Node root = new Node(15);
        root.setLeft(new Node(10));
        root.setRight(new Node(20));

        root.getLeftNode().setLeft(new Node(8));
        root.getLeftNode().setRight(new Node(12));
        root.getLeftNode().getRightNode().setLeft(new Node(11));
        root.getLeftNode().getRightNode().getLeftNode().setRight(new Node(88));
        root.getLeftNode().getRightNode().getLeftNode().setLeft(new Node(77));

        root.getRightNode().setLeft(new Node(16));
        root.getRightNode().setRight(new Node(25));

        traversal.levelOrderTraversal(root);
    }
}
