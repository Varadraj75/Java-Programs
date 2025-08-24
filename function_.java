public class function_
{
    public static int abc(int a , int b)
    {
        int sum = a+b;
        return sum;
    }
    public static double abc(double d , double k)
    {
        double sum = d+k;
        return sum;
    }
    public static void main(String args[])
    {
        int abc = abc(10,20);
        double kjc = abc(10.5,20.5);
        
        System.out.println("abc value is" +abc);
        System.out.println("kjc value is" +kjc);
    }
}