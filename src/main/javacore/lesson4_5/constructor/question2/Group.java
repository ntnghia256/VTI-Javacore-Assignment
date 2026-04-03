package main.javacore.lesson4_5.constructor.question2;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String groupName;
    private String creator;
    private Account[] accounts;
    private LocalDate createDate;

    public Group() {}

    public Group(String groupName, String creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String groupName, String creator, String[] usernames, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            accounts[i] = new Account(usernames[i]);
        }
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", creator='" + creator + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                ", createDate=" + createDate +
                '}';
    }
}
