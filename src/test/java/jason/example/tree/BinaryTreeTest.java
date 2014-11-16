package jason.example.tree;

import static org.junit.Assert.assertEquals;
import jason.example.tree.dataobject.BinaryTreeNode;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
    private BinaryTree bi;

    @Before
    public void setup() {
        bi = new BinaryTree();
    }

    @Test
    public void testSingleInsertTestGood() {
        Integer data = new Integer(3);

        BinaryTreeNode expected = new BinaryTreeNode();
        expected.setData(data);
        expected.setLeftNode(null);
        expected.setRightNode(null);

        BinaryTreeNode response = bi.insert(data);

        assertEquals(expected, response);
    }

    @Test
    public void testSizeGood() {
        BinaryTreeNode node = bi.insert(2);
        node = bi.insert(node, 1);
        node = bi.insert(node, 3);
        node = bi.insert(node, 5);
        node = bi.insert(node, 4);
        Integer response = bi.size(node);

        assertEquals(new Integer(5), response);
    }

    @Test
    public void testMinGood() {
        BinaryTreeNode node = bi.insert(5);
        node = bi.insert(node, 4);
        node = bi.insert(node, 3);
        node = bi.insert(node, 2);
        node = bi.insert(node, 1);
        Integer response = bi.min(node);

        assertEquals(new Integer(1), response);
    }

    @Test
    public void testMaxGood() {
        BinaryTreeNode node = bi.insert(1);
        node = bi.insert(node, 2);
        node = bi.insert(node, 3);
        node = bi.insert(node, 5);
        node = bi.insert(node, 4);
        Integer response = bi.max(node);

        assertEquals(new Integer(5), response);
    }
}
