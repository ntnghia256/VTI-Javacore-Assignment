package javacore.lesson8_9.collection.set;

import javacore.lesson8_9.collection.Student;

import java.util.*;

public class Main {
    public static void printAllElement(Set<Student> students) {
        System.out.println("List elements of Set: ");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static Student findById(Set<Student> stu, int id) {
        for (Student s : stu) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    private static void getDuplicate(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getName().equals(list.get(j).getName()))
                    System.out.println("Duplicate name: " + list.get(i).getName());
            }
        }
    }

    // First way
    private static List<Student> uniqueSet(Set<Student> set) {
        ArrayList<Student> arrayList = new ArrayList<>(set);
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).getName() != null && arrayList.get(i).getName().equals(arrayList.get(j).getName()))
                    arrayList.remove(i);
            }
        }
        return arrayList;
    }

    // Second way - uniqueStudent
    private static Set<Student> uniqueStudent(Set<Student> students) {
        Set<Student> uniqueStudent = new LinkedHashSet<>();
        Set<String> names = new HashSet<>();
        for (Student s : students) {
            if (!names.contains(s.getName())) {
                names.add(s.getName());
                uniqueStudent.add(s);
            }
        }
        return uniqueStudent;
    }

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

        // Add new student to the first
        Set<Student> newSet = new LinkedHashSet<>();
        newSet.add(new Student("First student"));
        newSet.addAll(students);
        students = newSet;
        printAllElement(students);

        // Add new student to the ene
        students.add(new Student("Last student"));
        printAllElement(students);

        // Reverse the elements
        List<Student> list = new ArrayList<>(students);
        Collections.reverse(list);
        students = new LinkedHashSet<>(list);
        printAllElement(students);

        // Find student by id
        System.out.println(findById(students, 3));

        // Get name (simulation)
        // code...

        // Print the duplicated name
        getDuplicate(list);

        // Delete student by id
        // Remove student
        students.removeIf(student -> student.getId() == 4);

        // Copy - Simulation List - Use keyword "addAll"

        // Create set students have name do not duplicate
        // First way
        list = uniqueSet(students);
        students = new LinkedHashSet<>(list);
        System.out.println("Set unique element");
        printAllElement(students);

        // Second way
        System.out.println("--------- Second way print unique students ---------");
        printAllElement(uniqueStudent(students));

        // Sort follow name
        Set<Student> sortUniqueStudent = new TreeSet<>(
                Comparator.comparing(Student::getName)
        ); // Initial TreeSet
        sortUniqueStudent.addAll(students);  // Sort and remove duplicate element --> Wonderful
        System.out.println("--------- Set unique student was sorted follow name ----------");
        printAllElement(sortUniqueStudent);
    }
}
