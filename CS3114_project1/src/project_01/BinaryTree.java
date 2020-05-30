package project_01;

/**
 * Represents a binary node later for the BST.
 *
 * @param <T>
 *            The type of data elements contained in the tree.
 * 
 * @author <Bozhao Lan> <lbozhao>
 * @version <05/29/2020>
 */
public class BinaryTree<T> {
    // Fields
    private T element;
    private BinaryTree<T> left;
    private BinaryTree<T> right;

    // Constructor
    /**
     * Instantiate the object of a node with one parameter.
     * 
     * @param value
     *            The value we want to store in the node.
     */
    public BinaryTree(T value) {
        element = value;
        left = null;
        right = null;

    }


    /**
     * Instantiate the object of a node with one parameter and other two nodes.
     * 
     * @param value
     *            The value we want to store in the node.
     * @param leftChild
     *            The other node we link as the left child.
     * @param rightChild
     *            The other node we link as the right child.
     */
    public BinaryTree(
        T value,
        BinaryTree<T> leftChild,
        BinaryTree<T> rightChild) {
        element = value;
        left = leftChild;
        right = rightChild;

    }


    // Methods
    /**
     * Get the data from this node.
     * 
     * @return the data of this node.
     */
    public T getElement() {
        return element;
    }


    /**
     * Set the data for this node.
     * 
     * @param value
     *            The new data value to store in this node.
     */
    public void setElement(T value) {
        element = value;
    }


    /**
     * Get the left child of this node.
     * 
     * @return This node's left child.
     */
    public BinaryTree<T> getLeft() {
        return left;
    }


    /**
     * Sets the left child of this node to another tree.
     * 
     * @param subtree
     *            The other node of tree.
     */
    public void setLeft(BinaryTree<T> subtree) {
        left = subtree;
    }


    /**
     * Get the right child of this node.
     * 
     * @return This node's right child.
     */
    public BinaryTree<T> getRight() {
        return right;
    }


    /**
     * Sets the right child of this node.
     * 
     * @param subtree
     *            The other node of tree.
     */
    public void setRight(BinaryTree<T> subtree) {
        right = subtree;
    }


    /**
     * See how many nodes we have in the tree
     * 
     * @return The size of this tree.
     */
    public int size() {
        if (left == null && right == null) {
            return 1;
        }
        else if (left != null && right == null) {
            return 1 + left.size();
        }
        else if (left == null && right != null) {
            return 1 + right.size();
        }
        else {
            return 1 + left.size() + right.size();
        }
    }


    /**
     * Calculate the level of the node, the root node will be count as the level
     * 0
     * And so on.
     * 
     * @return The level of this tree.
     */
    public int height() {
        if (left == null && right == null) {
            return 0;
        }
        else if (left != null && right == null) {
            return 1 + left.height();
        }
        else if (left == null && right != null) {
            return 1 + right.height();
        }
        else {
            return 1 + Math.max(left.height(), right.height());
        }
    }

} // BinaryTree End
