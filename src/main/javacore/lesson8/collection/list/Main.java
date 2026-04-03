package main.javacore.lesson8.collection.list;

import main.javacore.lesson8.collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static Student findStudentById(List<Student> students, int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    private static Student findStudentByName(List<Student> students, String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) return s;
        }
        return null;
    }

    private static Student deleteById(List<Student> students, int id) {
        Student s = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                s = students.get(i);
                students.remove(i);
                break;
            }
        }
        return s;
    }

    // Get duplicate student
    private static Student getDuplicateStudent(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().equals(students.get(j).getName())) {
                    return students.get(i);
                }
            }
        }
        return null;
    }

    // Print all student sorted follow name

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Cau"));
        students.add(new Student("An"));
        students.add(new Student("Binh"));
        students.add(new Student("Xa"));
        students.add(new Student("Vu"));
        students.add(new Student("Gia"));
        students.add(new Student("An"));
        students.add(new Student("An"));

        // Get total elements
        System.out.println("Total elements is: " + students.size());

        // Get 4th element
        Student student4 = students.get(4);
        System.out.println("The 4th element is: " + student4);

        // Print the first and the end elements of list
        System.out.println("The 1st element is: " + students.get(0));
        System.out.println("The end element is: " + students.get(students.size() - 1));

        // Add element at the first and the end of list
        Student s1 = new Student("First student");
        students.add(0, s1);
        System.out.println("Add 1st element success: " + s1);

        Student s2 = new Student("Last student");
        students.add(s2);
        System.out.println("Add the end element success: " + s2);

        // Reverse element
        Collections.reverse(students);
        System.out.println("List students after reverse: ");
        for (Student s : students) {
            System.out.println(s);
        }

        // Find student by id
        int id = 3;
        System.out.println("Student with id " + id + " is: " + findStudentById(students, id));

        // Find student by name
        String name = "An";
        System.out.println("Student with name " + name + " is: " + findStudentByName(students, name));

        // Get duplicate student
        System.out.println("The duplicate student name is: " + getDuplicateStudent(students));

        // Delete student by id
        int deteleById = 2;
        System.out.println("Delete student with id " + deteleById + " - " + deleteById(students, deteleById) + " success");
        System.out.println("List student after deleted");
        for (Student s : students) {
            System.out.println(s);
        }

        // Create ArrayList and copy all list students to it.
        ArrayList<Student> copyListStudents = new ArrayList<>();
        copyListStudents.addAll(students);
        System.out.println("List students had copied");
        for (Student stu : copyListStudents) {
            System.out.println(stu);
        }
    }
}
