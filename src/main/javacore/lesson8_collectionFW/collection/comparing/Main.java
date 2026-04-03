package main.javacore.lesson8_collectionFW.collection.comparing;

import main.javacore.lesson8_collectionFW.collection.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    // Print list Student sorted by name, birthday, point
    public static List<Student> listSorted(List<Student> list) {
        list.sort(Comparator.comparing(Student::getName).thenComparing(Student::getBirthday).thenComparing(Student::getPoint));
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Tran Thi C", "25/07/2002", 8.1f));
        listStudents.add(new Student("Luong Van D", "26/06/2002", 8.5f));
        listStudents.add(new Student("Luong Van D", "02/06/2002", 8.5f));
        listStudents.add(new Student("Nguyen Thi A", "27/08/2002", 5.75f));
        listStudents.add(new Student("Ho Trong G", "28/01/2002", 9.8f));
        listStudents.add(new Student("Doan Thi P", "29/05/2002", 4.5f));
        listStudents.add(new Student("Doan Thi P", "29/05/2002", 10.0f));
        listStudents.add(new Student("Quach Thi B", "01/04/2002", 6.5f));

        // Print list student has sorted
        System.out.println("List students has sorted by name: ");
        listSorted(listStudents).forEach(System.out::println);
    }
}
