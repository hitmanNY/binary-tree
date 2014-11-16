package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;

import org.junit.Before;
import org.junit.Test;

public class DepthFirstBinaryTreeTest {

    DepthFirstBinaryTree tree;

    @Before
    public void setup() {
        tree = new DepthFirstBinaryTree();
    }

    @Test
    public void testPrintPreOrderGood() {
        BinaryTreeNode node = tree.insert(7);
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

        System.out.print(" Nodes PreOrder: ");
        tree.printPreOrder(node);
        System.out.println();
    }

    @Test
    public void testPrintPostOrderGood() {
        BinaryTreeNode node = tree.insert(7);
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

        System.out.print(" Nodes PostOrder: ");
        tree.printPostOrder(node);
        System.out.println();
    }

    @Test
    public void testPrintInOrderGood() {
        BinaryTreeNode node = tree.insert(7);
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

        System.out.print(" Nodes InOrder: ");
        tree.printInOrder(node);
        System.out.println();
    }
}
