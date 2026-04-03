package main.javacore.lesson3.datatype_casting;

import java.util.Random;
import java.util.Scanner;

public class Question2_3_4 {
    private static Scanner sc = new Scanner(System.in);

    private static float devide(int a, int b) {
        return (float) a/b;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100000);
        System.out.printf("%05d%n", n);

        // Lay 2 so cuoi
        String str = String.format("%05d", n);
        String lastTwo = str.substring(3);
        System.out.println(lastTwo);

        System.out.println("Please enter 2 number a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Ket qua a/b la: " + devide(a, b));
    }
}
