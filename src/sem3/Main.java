package sem3;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        User oneUser = new User("Ян", "Янов", "Янович", LocalDate.now());
//        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
//        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());
//
//        TreeSet treeSet = new TreeSet(new UserComparator());
//        treeSet.add(oneUser);
//        treeSet.add(twoUser);
//        treeSet.add(threeUser);
//
//        System.out.println(treeSet);

        User Pupkin = new Teacher(2, "Иван", "Пупкин",
                "Олегович", LocalDate.now());
        User Filologov = new Teacher(3, "Петр", "Филологов",
                "Иванович", LocalDate.now());
        User Istorikov = new Teacher(1, "Семен", "Историков",
                "Семенович", LocalDate.now());

        TreeSet ts = new TreeSet(new TeacherComparator());
        ts.add(Pupkin);
        ts.add(Filologov);
        ts.add(Istorikov);

        System.out.println(ts);
    }
}
