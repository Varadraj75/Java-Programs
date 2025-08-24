public class calling
{
    public static int abc(int a , int b)
    {
        int x = a*b;
        return x;
    }
    public static void main(String args[])
    {
        int ab = abc(10,20);
        System.out.println(ab);
    }
}