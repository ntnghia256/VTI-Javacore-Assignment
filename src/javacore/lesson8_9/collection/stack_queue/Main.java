package javacore.lesson8_9.collection.stack_queue;

import java.util.*;

public class Main {
    private static void printEarlyToLate(ArrayList<String> stu) {
        // LIFO
        Stack<String> stack = new Stack<>();

        for (String name : stu) {
            stack.push(name);
        }

        System.out.println("The order sorted early -> late: ");
        for (String string : stack) {
            System.out.println(string);
        }
    }

    private static void printLateToEarly(ArrayList<String> name) {
        // FIFO
        Queue<String> queue = new LinkedList<>(name);

        System.out.println("The order sorted late -> early: ");
        List<String> temp = new ArrayList<>();
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            System.out.println(temp.get(i));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Nguyễn Văn Nam");
        students.add("Nguyễn Văn Huyên");
        students.add("Trần Văn Nam");
        students.add("Trần Văn A");

        printEarlyToLate(students);
        printLateToEarly(students);
    }
}
