public class Practical3 {
    public static void main(String args[])
    {
        int num =123,remainder=0,reverse=0;
        while(num>0)
        {
            remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }

        System.out.println(reverse);
    }
}
