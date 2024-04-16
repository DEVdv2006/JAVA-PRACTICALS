class Students 
{   public String name;
    public int enroll_num;
    public int age;
    public String branch;
    public void display_detail()
    {
        System.out.println("Name "+name);
        System.out.println("age "+age);
        System.out.println("rollno "+enroll_num);
        System.out.println("Branch "+branch);
    }
}
class Exam extends Students
{   
    public int subcode1,subcode2;
    
    public void fill_exam_form(String name,int enroll_num,int age,String branch)
    {
        this.name=name;
        this.enroll_num=enroll_num;
        this.age=age;
        this.branch=branch;
    }
    public void get_subject_code(int subcode1,int subcode2)
    {
        this.subcode1=subcode1;
        this.subcode2=subcode2;
    }
    public void show_subcode()
    {   System.out.println("code of subject 1 "+subcode1);
        System.out.println("code of subject 2 "+subcode2);
    }


}
class Result extends Students
{
    public int result1,result2;
    public void get_result(int r1,int r2)
    {
        this.result1=r1;
        this.result2=r2;
    }
    
    public void show_result()
    {   System.out.println("result of subject 1 "+result1);
        System.out.println("result of subject 2 "+result2);
    }
}
public class Practical16 {
    public static void main(String args[])

    {   
        Students s1 = new Students();
        Exam e1 = new Exam();
        e1.fill_exam_form("dev",52,17,"CE");
        e1.get_subject_code(47,89);
        Result r1 = new Result();
        r1.get_result(34,57);
        System.out.println("displaying all details of student");
        e1.display_detail();
        e1.show_subcode();
        r1.show_result();
    }
}
