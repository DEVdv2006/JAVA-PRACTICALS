class StaticDemo
{
    static int count = 0; //static variable
    static void print_message()
    {
        System.out.println("Value of static variable is "+count);
    }
}

public class Practical9 {
    public static void main(String args[])
    {
        StaticDemo obj1 = new StaticDemo();
        obj1.count = 2;
        obj1.print_message();
        StaticDemo.print_message();
        StaticDemo obj2 = new StaticDemo();
        obj2.print_message();
        obj2.count = 4;
        obj1.print_message();
    }
}
