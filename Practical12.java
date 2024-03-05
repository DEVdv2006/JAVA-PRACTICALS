class constructor_overloading
{ public String name;
  public int age;
  //constructor with no argument
  public constructor_overloading()
  {
    name="Default";
    age = 17;
  }
  //constructor with name argument
  public constructor_overloading(String stu_name)
  {
      name=stu_name;
  }
  public constructor_overloading(String name,int age)
  {
    this.name=name;
    this.age=age;
  }

}
public class Practical12 {
    public static void main(String args[])
    {
        constructor_overloading obj1 = new constructor_overloading();
        constructor_overloading obj2=new constructor_overloading("dev");
        constructor_overloading obj3 = new constructor_overloading("darshana",14);
    }
}
