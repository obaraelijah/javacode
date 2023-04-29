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

    //constructor -> prompt user to enter students name and year
    public Student() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstname = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastname = in.nextLine();

        System.out.print("1 - Freshman\n2 - sophomore\n3 - Juniour\n4 - Seniour\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstname + " " + lastname + " " + gradeYear + studentID);


    }

    // gen uique id
    private void setStudentID()
    {
        //grade level + static id
        id++;
        this.studentID =  gradeYear + "" + id;

    }
    // enroll courses
    public void enroll()
    {
        // get inside a loop, user hits 0 when done enrolling
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course =  in.nextLine();
            if (!course.equals("Q"))
            {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                 break;
                 }
        }   while ( 1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);

    }


    //view balance 


    //pay tuition


    // show status
    
}
