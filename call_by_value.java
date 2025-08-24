    public class call_by_value
{
    public static int sum ( int a , int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String args[])
    {
        int f = sum(4,5);
        System.out.println(f);
    }
}