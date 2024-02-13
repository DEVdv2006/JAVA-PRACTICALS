public class Practical2 {
    public static void main(String args[])
    {
        int a = 4;
        int b = 7;
        int c = 6;

        int max = a>b? (a>c?a:c):(b>c?b:c);
        System.out.println("maximum is "+ max);
    }
}
