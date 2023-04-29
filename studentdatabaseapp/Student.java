package studentdatabaseapp;

import java.util.Scanner;

public class Student
{
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //const
    public Student() 
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            System.out.print("Enter student first name: ");
            this.firstname = in.nextLine();
            
            System.out.print("Enter student last name: ");
            this.lastname = in.nextLine();

            System.out.print("1 - Freshman\n2 - sophomore\n3 - Juniour\n4 - Seniour\nEnter student class level: ");
            this.gradeYear = in.nextInt();
        }
        setStudentID();
    }

    // uique id
    private void setStudentID()
    {
        //grade level + static id
        id++;
        this.studentID =  gradeYear + "" + id;

    }
    // enroll courses
    public void enroll()
    {
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            try (Scanner in = new Scanner(System.in))
            {
                String course =  in.nextLine();
                if (!course.equals("Q"))
                {
                    courses = courses + "\n " + course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                }
                else {
                     break;
                     }
            }
        }   while ( 1 != 0);

    }


    //view balance 
    public void viewBalance()
    {
        System.out.println("Your balance is: Ksh." + tuitionBalance);
    }
    //pay tuition
    public void payTuition()
    {
        viewBalance();
        System.out.print("Enter your payment: Ksh.");
        try (Scanner in = new Scanner(System.in))
        {
            int payment = in.nextInt();
            tuitionBalance = tuitionBalance - payment;
            System.out.println("Thank you for your payments of Ksh." + payment);
        }
        viewBalance();

    }
    // show status
    public String toString()
    {
        return "Name: " + firstname + " " + lastname + 
                "\nGrade level" + gradeYear +
                "\nStudent ID" + studentID +
                "\nCourses Enrolled:" + courses + 
                "\nBalance: Ksh." + tuitionBalance; 
    }
    
}
