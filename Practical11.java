 class shape{
public float area(float radius)
{
    return 3.14F*radius*radius;
}
public float area(float l, float w)
{
    return l*w;
}
}
public class Practical11 {

    public static void main(String args[])
    {
        shape obj1 = new shape();
        System.out.println("Area of circle is "+obj1.area(3.16F));
        System.out.println("Area of rectangle is "+obj1.area(2F,3F));
    }
}
