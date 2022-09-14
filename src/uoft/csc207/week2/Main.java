package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
	    Person p = new Person(name, "moogah");
        System.out.println(p);
        Student s = new Student(new String[] {"A", "B", "C"}, "frooble");
        System.out.println(s);
    }
}
