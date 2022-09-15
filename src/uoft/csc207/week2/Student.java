package uoft.csc207.week2;

/**
 * A student at the UofT.
 */

public class Student extends Person {
    private final String studentNumber;

    /**
     * Return a string representation of this person with this format:
     * 'last name, other names: utorid'
     *
     * @return a string representation of this person
     */
    @Override
    public String toString() {
        return "Student: " + super.toString() + " " + this.studentNumber;
    }

    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param name   the person's name (family name last)
     * @param utorid the person's UTORid
     * @param stuNum the 10-digit student number
     */
    Student(String[] name, String utorid, String stuNum) {
        super(name, utorid);
        this.studentNumber = stuNum;
    }
}
