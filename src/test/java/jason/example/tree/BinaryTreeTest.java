package jason.example.tree;

import jason.example.tree.dataobject.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {
    private BinaryTree bi;

    @Before
    public void setup() {
        bi = new BinaryTree();
    }

    @Test
    public void testSingleInsertTestGood() {
        int data = 5;

        BinaryTreeNode expected = new BinaryTreeNode();
        expected.setData(data);
        expected.setLeftNode(null);
        expected.setRightNode(null);

        BinaryTreeNode response = bi.insert(data);

        assertEquals(expected, response);
    }

    @Test
    public void testDoubleInsertTestGood() {
        int firstData = 5;
        int secondData = 1;

        BinaryTreeNode leftLeaf = new BinaryTreeNode();

        leftLeaf.setData(secondData);
        leftLeaf.setLeftNode(null);
        leftLeaf.setRightNode(null);

        BinaryTreeNode expected = new BinaryTreeNode();

        expected.setData(firstData);
        expected.setLeftNode(leftLeaf);
        expected.setRightNode(null);

        bi.insert(firstData);
        BinaryTreeNode response = bi.insert(secondData);

        assertEquals(expected, response);
    }

    @Test
    public void testSizeGood() {
        bi.insert(2);
        bi.insert(1);
        bi.insert(3);
        bi.insert(5);
        bi.insert(4);

        assertEquals(5, bi.size());
    }

    @Test
    public void testMinGood() {
        bi.insert(5);
        bi.insert(4);
        bi.insert(3);
        bi.insert(2);
        bi.insert(1);

        assertEquals(1, bi.min());
    }

    @Test
    public void testMaxGood() {
        bi.insert(1);
        bi.insert(2);
        bi.insert(3);
        bi.insert(15);
        bi.insert(4);

        assertEquals(15, bi.max());
    }
}
