package javacore.lesson8_9.collection.set;

import javacore.lesson8_9.collection.list.Student;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();

        students.add(new Student("Nam"));
        students.add(new Student("Huyen"));
        students.add(new Student("Nam"));
        students.add(new Student("An"));
        students.add(new Student("Binh"));

        // Get total students
        System.out.println("Total students: " + students.size());

        // Get 4th element
        List<Student> listStudents = new ArrayList<>(students);
        System.out.println("Student at 4th is: " + listStudents.get(3));

        // Print first and last student
        Student first = null;
        Student last = null;

        for (Student s : students) {
            if (first == null) {
                first = s;
            }
            last = s;
        }

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
