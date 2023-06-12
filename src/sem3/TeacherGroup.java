package sem3;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }
}
