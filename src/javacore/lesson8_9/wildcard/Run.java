package javacore.lesson8_9.wildcard;

import javacore.lesson8_9.wildcard.entity.MyMath;

import java.util.ArrayList;

public class Run {
    private static <T extends Number> T findMax(T a, T b) {
        if (a.doubleValue() >= b.doubleValue()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 and 20.5: " + findMax(10, 20.5));
        System.out.println("Max of 5.5f and 3.2: " + findMax(5.5f, 3.2));

        // Initialize Math object
        MyMath math = new MyMath();
        System.out.println("Sum (2): " + math.sum(10, 20));
        System.out.println("Sum (3): " + math.sum(10, 20, 30.5));
        System.out.println("Sum (4): " + math.sum(1, 2, 3, 4L));
        System.out.println("Subtract: " + math.subtract(100, 45.5));
        System.out.println("Power (2^3): " + math.power(2, 3));

        // LIST OBJECT - CONTAINS LIST WILDCARD
        // ArrayList <Object>
        ArrayList<Object> listWildcards = new ArrayList<>();

        listWildcards.add("Nguyễn Văn Nam"); // String
        listWildcards.add(30);               // Integer
        listWildcards.add("Hà đông, Hà nội"); // String

        System.out.println("--- Customer Info ---");
        for (Object info : listWildcards) {
            System.out.println("- " + info);
        }
    }
}
