class  student_info 
{    int  val=5;
    public String name;
    public int enrollmentnum;
    public void get_info(String name,int enrollnum)
    {
        this.name=name;
        this.enrollmentnum=enrollnum;
    }

} 
class test extends student_info
{
    public int marks1,marks2;
    public void get_marks(int marks1,int marks2)
    {
        this.marks1=marks1;
        this.marks2=marks2;
    }
    public int calculate_avg_marks()
    {
       int avg=(marks1+marks2)/2;
        return avg;
    }
}
class sports extends test
{
    public int score1,score2;
    public void get_score(int score1,int score2)
    {
        this.score1=score1;
        this.score2=score2;
    }
    public int calculate_avg_score()
    {
        int avg_score= (score1+score2)/2;
        return avg_score;
    }
    public void display_info()
    {
        System.out.println("Name "+name);
        System.out.println("Enrollment number "+enrollmentnum);
        System.out.println("Average of two marks "+calculate_avg_marks());
        System.out.println("Average of two scores "+calculate_avg_score());
    }


}
public class Practical15 {
    public static void main(String args[])
    {
        sports obj1 = new sports();
        obj1.get_info("dev",52);
        obj1.get_marks(20,20);
        obj1.get_score(10,10);
        obj1.display_info();
    }
}
