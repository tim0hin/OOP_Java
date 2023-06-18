package sem5.service;

import sem5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    List<Student> studentList;

    public StudentServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public Student addStudent(String name, Integer yearOfBorn) {
        return new Student(name, yearOfBorn);
    }
}
