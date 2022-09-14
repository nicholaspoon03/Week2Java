package uoft.csc207.week2;

/**
 * A student at the UofT.
 */

public class Student extends Person {
    /**
     * Return a string representation of this person with this format:
     * 'last name, other names: utorid'
     *
     * @return a string representation of this person
     */
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param name   the person's name (family name last)
     * @param utorid the person's UTORid
     */
    Student(String[] name, String utorid) {
        super(name, utorid);
    }
}
