package com.pluralsight;

public class Student {

    private String firstName;
    private String lastName;
    private String email;
    private double gpa;

    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.gpa = 0;
    }

    public Student(String firstName, String lastName, String email, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nEmail: " + email +
                "\nGPA: " + gpa;
    }

}
