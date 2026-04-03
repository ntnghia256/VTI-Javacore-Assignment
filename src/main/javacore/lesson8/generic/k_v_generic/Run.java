package main.javacore.lesson8.generic.k_v_generic;

import main.javacore.lesson8.generic.k_v_generic.entity.MyMap;
import main.javacore.lesson8.generic.k_v_generic.entity.Phone;
import main.javacore.lesson8.generic.k_v_generic.entity.Staff;

public class Run {
    public static void main(String[] args) {
        MyMap<String, String> student = new MyMap<>("SV123", "Nguyen Van A");

        System.out.println("--- Thông tin sinh viên ---");
        System.out.println("Mã số sinh viên (Key): " + student.getKey());
        System.out.println("Tên sinh viên (Value): " + student.getValue());

        MyMap<Integer, String> student2 = new MyMap<>(202401, "Tran Thi B");
        System.out.println("\nSinh viên 2: " + student2.getKey() + " - " + student2.getValue());

        // Phone class
        Phone<String, String> emailContact = new Phone<>("nva@gmail.com", "0901-234-567");
        System.out.println("Case A (Email): " + emailContact.getKey()
                + " -> SDT: " + emailContact.getPhoneNumber());

        Phone<Integer, String> indexContact = new Phone<>(1, "0912-888-999");
        System.out.println("Case B (STT): " + indexContact.getKey()
                + " -> SDT: " + indexContact.getPhoneNumber());

        Phone<String, String> nameContact = new Phone<>("Nguyen Van A", "0988-777-666");
        System.out.println("Case C (Tên): " + nameContact.getKey()
                + " -> SDT: " + nameContact.getPhoneNumber());

        // STAFF CLASS
        Staff<Integer, String> staff1 = new Staff<>(101, "Nguyen Van An");
        System.out.println("Staff 1:");
        System.out.println("- ID: " + staff1.getId());
        System.out.println("- Name: " + staff1.getName());

        System.out.println("--------------------------");

        Staff<Long, String> staff2 = new Staff<>(9999999999L, "Tran Thi Binh");
        System.out.println("Staff 2:");
        System.out.println("- ID: " + staff2.getId());
        System.out.println("- Name: " + staff2.getName());
    }
}
