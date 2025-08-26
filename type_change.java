import java.util.Scanner;
class type_change
{
    public static void main(String args[])
    {
        Scanner so = new Scanner(System.in);
        System.out.println("Enter a float value");
        float a = so.nextFloat();
        double b = a;
        System.out.println("The double value is "+b);
    }
}