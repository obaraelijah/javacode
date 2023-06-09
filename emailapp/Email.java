package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    //constructor for fast and last name
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department =  setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password: " + this.password);

        // generate email
        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for department
    private String setDepartment()
    {
        System.out.print("New worker: " + firstName + " .Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        try (Scanner in = new Scanner(System.in)) {
            int depChoice = in.nextInt();
            if (depChoice == 1) { return "sales";}
            else if (depChoice == 2) { return "dev"; }
            else if (depChoice == 3) { return "acct"; }
            else { return ""; }
        }
    }

    //generate random password
    private String randomPassword(int length)
     {
        String passwordSet = "ABCDEFGHIGHQWERTYUIOPLKJHGFDSASXCVBNM!@#$%^&*";
        char[] passWord = new char[length];
        for (int i = 0; i<length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            passWord[i] = passwordSet.charAt(rand);
        }
        return new String(passWord);
     }
    // set mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }

    //set alternate email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    }

    // change password
    public void changePassword(String password)
    {
        this.password =  password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo()
    {
        return "DISPLAY NAME: " + firstName + " " + lastName + " " +
                "\nCOMPANY EMAIL: " + email + " " +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
