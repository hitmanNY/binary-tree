package jason.example.tree.dataobject;

public class BinaryTreeNode {
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;
    Integer data;

    public BinaryTreeNode() {
        this(null);
    }

    public BinaryTreeNode(Integer incomingData) {
        this.data = incomingData;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();

        buf.append("Data=");
        buf.append(data);

        return buf.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((leftNode == null) ? 0 : leftNode.hashCode());
        result = prime * result + ((rightNode == null) ? 0 : rightNode.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BinaryTreeNode other = (BinaryTreeNode) obj;
        if (data == null) {
            if (other.data != null) {
                return false;
            }
        } else if (!data.equals(other.data)) {
            return false;
        }
        if (leftNode == null) {
            if (other.leftNode != null) {
                return false;
            }
        } else if (!leftNode.equals(other.leftNode)) {
            return false;
        }
        if (rightNode == null) {
            if (other.rightNode != null) {
                return false;
            }
        } else if (!rightNode.equals(other.rightNode)) {
            return false;
        }

        return true;
    }

}
