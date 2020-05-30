package project_01;

import student.TestCase;

/**
 * The test class for student class
 * 
 * @author Bozhao Lan <lbozhao>
 * @version <05/29/2020>
 */
public class StudentTest extends TestCase {
    // Fields
    private Student someone;

    // Methods
    /**
     * set up the instantiation
     */
    public void setUp() {
        someone = new Student("Alan", "Lan");

    }


    /**
     * To test the method getFirstName()
     */
    public void testGetFirstName() {
        assertEquals("Alan", someone.getFirstName());

    }


    /**
     * To test the method getLastName()
     */
    public void testGetLastName() {
        assertEquals("Lan", someone.getLastName());

    }


    /**
     * To test the method addScore() and getScore
     */
    public void testGetScore() {
        someone.addScore(60);
        assertEquals(60, someone.getScore());
    }

} // StudentTest End
