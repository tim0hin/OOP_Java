package sem5.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> studentList;
    private Teacher teacher;
    private Integer groupID;

    public StudentGroup() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }
}
