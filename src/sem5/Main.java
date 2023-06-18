package sem5;

import sem5.controller.Controller;
import sem5.model.Student;
import sem5.model.StudentGroup;
import sem5.model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        Teacher prepodavalov = new Teacher("Преподавалов Препод Преподавалович", 1964);
        Student ivanov = new Student("Иванов Иван Иванович",1994);
        Student petrov = new Student("Петров Петр Петрович", 1995);
        Student sidorov = new Student("Сидоров Семен Семенович", 1995);
        List<Student> gr1 = new ArrayList<>(Arrays.asList(ivanov,petrov,sidorov));

        Teacher neznanov = new Teacher("Незнанов Леонид Незнаевич", 1975);
        Student nikitin = new Student("Никитин Никита Никитич", 1990);
        Student pupkin = new Student("Пупкин Петр Иванович", 1989);
        Student kudrin = new Student("Кудрин Кирилл Кириллович", 1987);
        List<Student> gr2 = new ArrayList<>(Arrays.asList(nikitin,pupkin,kudrin));

        StudentGroup group1 = controller.createGroup(gr1, prepodavalov);
        controller.read(group1);

        StudentGroup group2 = controller.createGroup(gr2, neznanov);
        controller.read(group2);

    }
}
