package studentdatabaseapp;

public class StudentDatabaseApp
{
    public static void main(String[] args)
    {
        Student stud1 = new Student();
        stud1.enroll();
        stud1.payTuition();
        System.out.println(stud1.toString()); 
     
    }
}
