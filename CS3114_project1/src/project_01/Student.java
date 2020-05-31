package project_01;

/**
 * A class represent the data of student, a student should have its first name,
 * last name, scores
 * 
 * @author Bozhao Lan
 * @version 05-28-2020
 */
public class Student implements Comparable<Student> {
    // Fields
    private String firstName;
    private String lastName;
    private int score;

    // Constructor
    /**
     * Instantiate the object of student
     * 
     * @param firstname
     *            The first name of the student
     * @param lastName
     *            The last name of the student
     */
    public Student(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
        score = 0;
    }


    /**
     * Get the first name of the student
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;

    }


    /**
     * Get the last name of the student
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;

    }


    /**
     * The method to give a score to the student
     * 
     * @param insertedScore
     *            The score you want to assign to this student.
     */
    public void addScore(int insertedScore) {
        score = insertedScore;
    }


    /**
     * The method to get the score
     * 
     * @return score
     */
    public int getScore() {
        return score;

    }


    /**
     * The method for comparing the last name with another student object.
     * If the last name is the same, then comparing with the first name.
     * 
     * @param otherStudent
     *            The other student that will be compared with this student.
     * 
     */
    @Override
    public int compareTo(Student otherStudent) {
        // Compare the last name.
        if (this.lastName.toUpperCase().compareTo(otherStudent.getLastName()
            .toUpperCase()) < 0) {
            return -1;
        }
        else if (this.lastName.toUpperCase().compareTo(otherStudent
            .getLastName().toUpperCase()) > 0) {
            return 1;
        }
        // If the last name is the same, then compare the first name.
        else if (this.firstName.toUpperCase().compareTo(otherStudent
            .getFirstName().toUpperCase()) < 0) {
            return -1;
        }
        else if (this.firstName.toUpperCase().compareTo(otherStudent
            .getFirstName().toUpperCase()) > 0) {
            return 1;
        }
        // If the last name and first name are all the same.
        else {
            return 0;
        }
    }

}// End class
