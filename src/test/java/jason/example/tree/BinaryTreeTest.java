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

}
