package javacore.lesson4_5.constructor.question2;

import java.sql.Date;
import java.time.LocalDate;

public class Account {
    private short id;
    private String email;
    private String username;
    private String fullName;
    private String position;
    private LocalDate createDate;

    public Account() {}

    public Account(String username) {
        this.username = username;
    }

    public Account(short id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = lastName + " " + firstName;
    }

    public Account(short id, String email, String username, String firstName, String lastName, String position) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = lastName + " " + firstName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(short id, String email, String username, String firstName, String lastName, String position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = lastName + " " + firstName;
        this.position = position;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
