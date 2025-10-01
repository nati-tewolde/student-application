package com.pluralsight;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = input.nextLine();

        System.out.print("Last name: ");
        String lastName = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("GPA: ");
        double gpa = input.nextDouble();

        email = email.trim().toLowerCase();

        Student firstStudent = new Student(firstName, lastName, email, gpa);

        System.out.println(firstStudent);

        if (gpa >= 3.5) {
            System.out.println("This student is on the honor roll!");
        } else {
            System.out.println("This student is in good standing");
        }

    }
}
