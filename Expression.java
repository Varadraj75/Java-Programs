import java.util.Scanner;
public class Expression
{
    public static void main(String args[])
    {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter the value of the mb");
        double mb = so.nextDouble();
        System.out.print("Enter the value of the k");
        double k = so.nextDouble();
        System.out.print("Enter the value of the x");
        double x = so.nextDouble();
        System.out.print("Enter the value of the y");
        double y = so.nextDouble();
        System.out.print("Enter the value of the a");
        double a = so.nextDouble();
        System.out.print("Enter the value of the b");
        double b = so.nextDouble();
        
        double v = mb*3/4+k/4+8-mb-5/8;
        double j = x*y*y*x/2;
        double f = a/2+5+6*a/b;
        System.out.println("The v expression is" +v);
        System.out.println("The j expression is" +j);
        System.out.println("The f expression is" +f);
    }
}