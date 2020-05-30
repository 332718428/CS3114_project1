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

} // BST End
