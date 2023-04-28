package studentdatabaseapp;

import java.util.Scanner;

public class Student
{
    private String firstname;
    private String lastname;
    private int gradeYear;
    private int studentsID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

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
        System.out.println(firstname + " " + lastname + " " + gradeYear);
    }
    


    // gen uique id


    // enroll courses


    //view balance 


    //pay tuition


    // show status
    
}
