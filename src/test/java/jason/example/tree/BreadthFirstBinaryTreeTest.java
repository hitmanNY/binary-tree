package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;

import org.junit.Before;
import org.junit.Test;

public class BreadthFirstBinaryTreeTest {

    BreadthFirstBinaryTree tree;
    BinaryTreeNode node;

    @Before
    public void setup() {
        tree = new BreadthFirstBinaryTree();

        node = tree.insert(7);
        node = tree.insert(node, 1);
        node = tree.insert(node, 0);
        node = tree.insert(node, 3);
        node = tree.insert(node, 2);
        node = tree.insert(node, 5);
        node = tree.insert(node, 4);
        node = tree.insert(node, 6);
        node = tree.insert(node, 9);
        node = tree.insert(node, 8);
        node = tree.insert(node, 10);

    }

    @Test
    public void testPrintBreadthFirstOrderGood() {

        System.out.print(" Nodes BreadthFirst: ");
        tree.printBreadthFirstOrder(node);
        System.out.println();
    }
}
