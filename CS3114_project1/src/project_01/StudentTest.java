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


    /**
     * To test the method of compareTo().
     */
    public void testCompareTo() {
        // If the last name is different.
        Student alan = new Student("Alan", "Ac");
        Student bob = new Student("Bob", "ac");
        assertEquals(-1, alan.compareTo(bob));
        assertEquals(1, bob.compareTo(alan));

        // If the last name is same.
        Student cat = new Student("Cat", "ab");
        Student dog = new Student("dog", "ab");
        assertEquals(-1, cat.compareTo(dog));
        assertEquals(1, dog.compareTo(cat));

        // If the first character of the last name and first name is same.
        Student sameCat = new Student("cat", "ab");
        assertEquals(0, cat.compareTo(sameCat));
    }

} // StudentTest End
