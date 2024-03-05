import java.util.Scanner;


class copyConstructorDEMO
{  public int age;
   public String name;
   copyConstructorDEMO(int age,String name){this.age=age;this.name=name;}
   copyConstructorDEMO(copyConstructorDEMO obj1){ 
    System.out.println("copy constructor called");
    this.age=obj1.age;
    this.name=obj1.name;
   }

}
public class test{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}