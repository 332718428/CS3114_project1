package project_01;

/**
 * A class represent the data structure of binary search tree
 * 
 * @author Bozhao Lan
 * @version 05-28-2020
 */
public class BST<T extends Comparable<T>> {
    // Fields
    private BinaryTree<T> root;
    private int nodecount;

    // Constructor
    /**
     * Instantiate the object of BST
     */
    public BST() {
        root = null;
        nodecount = 0;

    }


    // Methods
    /**
     * The method to clear all nodes in this binary search tree
     */
    public void clear() {
        root = null;
        nodecount = 0;

    }


    /**
     * The method to insert node into this binary search tree.
     * It contains a private help method.
     * 
     * @param node
     *            The other node we want to insert into this BST.
     */
    public void insert(BinaryTree<T> node) {
        root = insertHelp(root, node);
        nodecount++;
    }


    /**
     * The help method for the method insert().
     * 
     * @param rt
     *            The root of this BST.
     * @param insertNode
     *            The node we want to insert into this BST, if there is no root,
     *            then it will be come the root.
     * @return
     *         The BST with new node connect to it.
     */
    private BinaryTree<T> insertHelp(
        BinaryTree<T> rt,
        BinaryTree<T> insertNode) {
        if (rt == null) {
            return insertNode;
        }

        if (rt.getElement().compareTo(insertNode.getElement()) >= 0) {
            rt.setLeft(insertHelp(rt.getLeft(), insertNode));
        }
        else {
            rt.setRight(insertHelp(rt.getRight(), insertNode));
        }

        return rt;
    }


    /**
     * The method to remove the specific node in this BST.
     * We have two help method here:
     * findHelp() is a help method to find if the node we are looking for is in
     * this tree.
     * removeHelp() is a help method to remove the specific node from this BST.
     * 
     * @param node
     *            The node we want to remove from this BST.
     * @return
     */
    public BinaryTree<T> remove(BinaryTree<T> node) {
        BinaryTree<T> temp = findHelp(root, node); // First find it
        if (temp != null) {
            root = removeHelp(root, node); // Now remove it
            nodecount--;
        }
        return temp;
    }


    /**
     * The private help method to find the node we want.
     * 
     * @param rt
     *            We are looking for the node from this rt.
     * @param node
     *            The node we are looking for.
     * @return
     *         Return the node if we find it.
     */
    private BinaryTree<T> findHelp(BinaryTree<T> rt, BinaryTree<T> node) {
        if (rt == null) {
            return null;
        }

        if (rt.getElement().compareTo(node.getElement()) > 0) {
            return findHelp(rt.getLeft(), node);
        }
        else if (rt.getElement().compareTo(node.getElement()) == 0) {
            return rt;
        }
        else {
            return findHelp(rt.getRight(), node);
        }
    }


    /**
     * The private method to help remove the node.
     * 
     * @param rt
     *            We are removing the node from this rt.
     * @param node
     *            The node we want to remove.
     * @return
     *         The upgraded root
     */
    private BinaryTree<T> removeHelp(BinaryTree<T> rt, BinaryTree<T> node) {
        if (rt.getElement().compareTo(node.getElement()) > 0) {
            rt.setLeft(removeHelp(rt.getLeft(), node));
        }
        else if (rt.getElement().compareTo(node.getElement()) < 0) {
            rt.setRight(removeHelp(rt.getRight(), node));
        }
        // Find the target
        else {
            if (rt.getLeft() == null) {
                return rt.getRight();
            }
            else if (rt.getRight() == null) {
                return rt.getLeft();
            }
            // If it has two children
            else {
                BinaryTree<T> temp = getMax(rt.getLeft());
                rt.setElement(temp.getElement());
                rt.setLeft(deleteMax(rt.getLeft()));
            }
        }

        return rt;
    }


    /**
     * The help method we will use in removeHelp().
     * 
     * @param rt
     *            The root we want to find the maximum node.
     * @return
     *         The maximum node we found.
     */
    private BinaryTree<T> getMax(BinaryTree<T> rt) {
        if (rt.getRight() == null) {
            return rt;
        }

        return getMax(rt.getRight());
    }


    /**
     * The help method we will use in removeHelp().
     * 
     * @param rt
     *            The root we want to find the maximum node.
     * @return
     *         The upgraded root.
     */
    private BinaryTree<T> deleteMax(BinaryTree<T> rt) {
        if (rt.getRight() == null) {
            return rt.getLeft();
        }
        rt.setRight(deleteMax(rt.getRight()));

        return rt;
    }

} // BST End
