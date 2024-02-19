 class Student
{
    int enrollmentnum;
    String name;
    
}

public class Practical6
{
    public static void main(String args[])
    {  Student s1 = new Student();
       s1.enrollmentnum = 52;
       s1.name = "dev";
       Student s2 = new Student();
       s2.enrollmentnum = 46;
       s2.name ="darshana";
       System.out.println("name of student 1"+s1.name+" enrollment "+s1.enrollmentnum);
       System.out.println("name of student 2"+s2.name+" enrollment "+s2.enrollmentnum);
       


    }
}