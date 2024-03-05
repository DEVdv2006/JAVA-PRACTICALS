class  student_info 
{    
    public String name;
    public int enrollmentnum;
    public void get_info(String name,int enrollnum)
    {
        this.name=name;
        this.enrollmentnum=enrollnum;
    }

} 
class result extends student_info
{
    public int marks1,marks2;
    public void get_marks(int marks1,int marks2)
    {
        this.marks1=marks1;
        this.marks2=marks2;
    }
    public void display_info()
    {
        System.out.println("Name "+name);
        System.out.println("Enrollment number "+enrollmentnum);
        System.out.println("Average of two marks "+(marks1+marks2)/2);
    }
}
public class Practical14 {
    public static void main(String args[])
    {
        result r1 = new result();
        r1.get_info("dev",52);
        r1.get_marks(20,20);
        r1.display_info();

        
        
    
    }
}
