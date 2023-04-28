package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor to receive fast and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName );

        //call a method asking for a department returndepartment
        this.department =  setDepartment();
        System.out.println("Department:" + this.department);
    }

    private String setDepartment()
    {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "dev"; }
        else if (depChoice == 3) { return "acct"; }
        else { return ""; }
    }

    // Ask for department

    //generate random password

    // set mailbox capacity

    //set alternate email

    // change password
}
