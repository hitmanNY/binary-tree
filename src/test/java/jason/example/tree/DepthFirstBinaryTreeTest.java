package jason.example.tree;

import org.junit.Before;
import org.junit.Test;

public class DepthFirstBinaryTreeTest {

    private DepthFirstBinaryTree tree;

    @Before
    public void setup() {
        tree = new DepthFirstBinaryTree();

        tree.insert(7);
        tree.insert(1);
        tree.insert(0);
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);

    }

    @Test
    public void testPrintPreOrderGood() {

        System.out.print(" Nodes PreOrder: ");
        tree.printPreOrder();
        System.out.println();
    }

    @Test
    public void testPrintPostOrderGood() {

        System.out.print(" Nodes PostOrder: ");
        tree.printPostOrder();
        System.out.println();
    }

    @Test
    public void testPrintInOrderGood() {

        System.out.print(" Nodes InOrder: ");
        tree.printInOrder();
        System.out.println();
    }
}
