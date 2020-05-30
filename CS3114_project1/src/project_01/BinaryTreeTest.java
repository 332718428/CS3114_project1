package project_01;

import student.TestCase;

/**
 * The test class for BinaryTree class
 * 
 * @author Bozhao Lan <lbozhao>
 * @version <05/30/2020>
 */
public class BinaryTreeTest extends TestCase {
    // Fields
    private BinaryTree<String> someTree;
    private BinaryTree<String> otherTree;

    // Methods
    /**
     * set up the instantiation
     */
    public void setUp() {
        someTree = new BinaryTree<String>("Alan");
        BinaryTree<String> A = new BinaryTree<String>("A");
        BinaryTree<String> B = new BinaryTree<String>("B");
        otherTree = new BinaryTree<String>("Bob", A, B);

    }


    /**
     * To test the method of setElement() and getElement().
     */
    public void testSetAndGetElement() {
        someTree.setElement("Allen");
        assertEquals("Allen", someTree.getElement());

    }


    /**
     * To test the method of setRight() and getRight().
     */
    public void testSetAndGetRight() {
        BinaryTree<String> rightTree = new BinaryTree<String>("Right");
        someTree.setRight(rightTree);
        assertEquals(rightTree, someTree.getRight());

    }


    /**
     * To test the method of setLeft() and getLeft().
     */
    public void testSetAndGetLeft() {
        BinaryTree<String> leftTree = new BinaryTree<String>("Left");
        someTree.setLeft(leftTree);
        assertEquals(leftTree, someTree.getLeft());

    }


    /**
     * To test the method of size()
     */
    public void testSize() {
        // Test when there is no child.
        assertEquals(1, someTree.size());

        // Test when there is one left child
        BinaryTree<String> leftTree = new BinaryTree<String>("Left");
        someTree.setLeft(leftTree);
        assertEquals(2, someTree.size());

        // Test when there is one right child.
        BinaryTree<String> trialTree = new BinaryTree<String>("A");
        BinaryTree<String> rightTree = new BinaryTree<String>("Right");
        trialTree.setRight(rightTree);
        assertEquals(2, trialTree.size());

        // Test when there is two children.
        assertEquals(3, otherTree.size());

    }


    /**
     * To test the method height().
     */
    public void testHeight() {
        // Test when there is no child.
        assertEquals(0, someTree.height());

        // Test when there one left child
        BinaryTree<String> leftTree = new BinaryTree<String>("Left");
        someTree.setLeft(leftTree);
        assertEquals(1, someTree.height());

        // Test when there is one right child.
        BinaryTree<String> trialTree = new BinaryTree<String>("A");
        BinaryTree<String> rightTree = new BinaryTree<String>("Right");
        trialTree.setRight(rightTree);
        assertEquals(1, trialTree.height());

        // Test when there is two children.
        assertEquals(1, otherTree.height());
        
        // Test when there is four node
        otherTree.getLeft().setLeft(leftTree);
        assertEquals(2, otherTree.height());

    }

} // BinaryTreeTest End
