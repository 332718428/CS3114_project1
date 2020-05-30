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
     * If the last name is the same, then comparing with the first name
     * 
     */
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return 0;
    }// End class
