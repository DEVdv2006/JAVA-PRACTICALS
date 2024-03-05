public class Practical13
{
    public static void main(String args[])
    {
        String mystr = "HELLO WORLD";
        System.out.println(mystr.charAt(8));
        System.out.println(mystr.contains("ELLO"));
        System.out.println(mystr.format("I am saying %s",mystr));
        System.out.println(mystr.length());
        System.out.println(mystr.split(" ", 2)[1]);
    }
}
