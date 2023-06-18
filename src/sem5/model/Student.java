package sem5.model;

public class Student extends User {
    private Integer studentID;
    private static Integer genID = 0;

    public Student(String name, Integer yearOfBorn) {
        super(name, yearOfBorn);
        this.studentID = genID++;
    }

    public Integer getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return studentID + " " + super.toString();
    }
}
