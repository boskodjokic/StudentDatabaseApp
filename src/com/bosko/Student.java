package com.bosko;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private double tuitionBalance = 0;
    private static double costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter students first name: ");
        this.firstName = s.nextLine();
        System.out.println("Enter students last name: ");
        this.lastName = s.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:  ");
        this.gradeYear = s.nextInt();
        setStudentID();

    }

    private void setStudentID() {
        id++;
        this.studentID =  gradeYear + "" + id;
    }

    public void enroll() {
        boolean check = true;

        while (check) {
                System.out.println("Enter course to enroll (Q to quit): ");
                Scanner s = new Scanner(System.in);
                String course = s.nextLine();
                if (!course.toUpperCase().equals("Q")) {
                    courses += "\n " + course;
                    tuitionBalance += costOfCourse;
                    check = true;
                } else {
                    check = false;
                }
        }

}

public void viewBalance(){
    System.out.println("Your balance is: $" + tuitionBalance);
}

public void payTuition() {
        viewBalance();
    System.out.print("Enter your payment: $");
        Scanner s = new Scanner(System.in);
        double payment = s.nextDouble();
        tuitionBalance -= payment;
    System.out.println("Thank you for your payment of $" + payment);
    viewBalance();
}

public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBallance: $" + tuitionBalance;
}

}

