package sem5.service;

import sem5.model.Student;
import sem5.model.StudentGroup;
import sem5.model.Teacher;

import java.util.List;

public class StudentGroupServiceImpl implements StudentGroupService{
    static Integer genID = 0;

    @Override
    public StudentGroup createGroup(List<Student> students, Teacher teacher) {
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.setStudentList(students);
        studentGroup.setTeacher(teacher);
        studentGroup.setGroupID(genID++);
        return studentGroup;
    }

    @Override
    public void readGroup(StudentGroup group) {
        System.out.println("Group number " + group.getGroupID());
        System.out.println(group.getTeacher());
        for(Student s: group.getStudentList()){
            System.out.println("\t" + s);
        }
        System.out.println();
    }
}
