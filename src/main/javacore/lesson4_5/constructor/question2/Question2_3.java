package main.javacore.lesson4_5.constructor.question2;

import java.time.LocalDate;

public class Question2_3 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account(
                (short) 1,
                "nghia@gmail.com",
                "nghia256",
                "Nghia",
                "Nguyen Trong"
        );
        Account acc3 = new Account(
                (short) 3,
                "nghia@gmail.com",
                "nghia256",
                "Nghia",
                "Nguyen Trong",
                "Manager"
        );
        Account acc4 = new Account(
                (short) 4,
                "nghia@gmail.com",
                "nghia256",
                "Nghia",
                "Nguyen Trong",
                "President",
                LocalDate.now()
        );

        // Group
        Group group1 = new Group();

        Account[] accounts = {new Account("abc"), new Account("bcd")};
        Group group2 = new Group("LamYen", "TNghia", accounts, LocalDate.now());

        String[] usernames = {"A", "B", "C"};
        Group group3 = new Group("Vu Gia", "TNghia", usernames, LocalDate.now());

        // Print
        System.out.println(group2);
        System.out.println("---------------------------");
        System.out.println(group3);
    }
}
