package sem5.model;

public class Teacher extends User{
    private Integer idTeacher;
    private static Integer genID = 0;

    public Teacher(String name, Integer yearOfBorn) {
        super(name, yearOfBorn);
        this.idTeacher = genID++;
    }

    @Override
    public String toString() {
        return "Teacher " + idTeacher + " " + super.toString();
    }
}
