package sem5.service;

import sem5.model.Student;
import sem5.model.StudentGroup;
import sem5.model.Teacher;

import java.util.List;

public interface StudentGroupService {
    public StudentGroup createGroup(List<Student> students, Teacher teacher);
    public void readGroup(StudentGroup group);
}
