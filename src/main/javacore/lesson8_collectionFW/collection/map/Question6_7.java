package main.javacore.lesson8_collectionFW.collection.map;

import main.javacore.lesson8_collectionFW.collection.Student;
import main.javacore.lesson8_collectionFW.collection.set.Main;

import java.util.*;

public class Question6_7 {
    // Print all element in Map
    public static void printAllElement(Map<Integer, Student> studentMap) {
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                    ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        ArrayList<Student> students = new ArrayList<>();

        // Initialize list data
        students.add(new Student("Nam"));
        students.add(new Student("Huyen"));
        students.add(new Student("An"));
        students.add(new Student("Binh"));

        // Add data to Map
        for (Student s : students) {
            studentMap.put(s.getId(), s);
        }
        System.out.println("List all element in HashMap");
        printAllElement(studentMap);

        // Print list student has sorted follow name
        // Sort Map follow value
        studentMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(
                        Comparator.comparing(Student::getName)
                ))
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue()));

        // Convert Map student to Set
        Set<Student> setStudents = new HashSet<>();
        studentMap.forEach((key, value) -> setStudents.add(value));
        Main.printAllElement(setStudents);
    }
}
