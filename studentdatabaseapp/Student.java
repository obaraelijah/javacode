package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstname = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastname = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    // unique id
    private void setStudentID()
    {
        // grade level + static id
        id++;
        this.studentID =  gradeYear + "" + id;

    }

    // enroll courses
    public void enroll() {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course =  in.nextLine();
            if (course.equalsIgnoreCase("Q")) 
            {
                break;
            }
            courses = courses + "\n" + course;
            tuitionBalance += costOfCourse;
        }
    }

    // view balance
    public void viewBalance()
    {
        System.out.println("Your balance is: Ksh." + tuitionBalance);
        if (tuitionBalance == 0) 
        {
            System.out.println("You have fully paid up. Thank you!");
        }
    }

    // pay tuition
    public void payTuition() 
    {
        viewBalance();
        Scanner in = new Scanner(System.in);
        while (tuitionBalance > 0) 
        {
            System.out.print("Enter your payment: Ksh.");
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            if (tuitionBalance < 0) {
                tuitionBalance = 0;
            }
            System.out.println("Thank you for your payment of Ksh." + payment);
            viewBalance();
        }
    }

    // show status
    public String toString() {
        return "Name: " + firstname + " " + lastname +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: Ksh. " + tuitionBalance;
    }
}
