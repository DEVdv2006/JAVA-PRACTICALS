class ThisDemo
{
   String name;
   ThisDemo(String input_name)
   {
      this.name = input_name;
      System.out.println(this.name);
   }

}

public class Practical8 {
    public static void main(String args[])
    {
        ThisDemo obj1 = new ThisDemo("dev");
    }
}
