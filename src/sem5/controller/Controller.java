package sem5.controller;

import sem5.model.Student;
import sem5.model.StudentGroup;
import sem5.model.Teacher;
import sem5.service.StudentGroupServiceImpl;
import sem5.service.StudentServiceImpl;

import java.util.List;

public class Controller {
    StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl();
    StudentServiceImpl dataService = new StudentServiceImpl();

    public StudentGroup createGroup(List<Student> studentList, Teacher teacher) throws Exception {
        return studentGroupServiceImpl.createGroup(studentList, teacher);
    }

    public Student addStudent(String name, Integer yearOfBorn){
        return this.dataService.addStudent(name, yearOfBorn);
    }
    public void read(StudentGroup group) {
        studentGroupServiceImpl.readGroup(group);
    }
}
