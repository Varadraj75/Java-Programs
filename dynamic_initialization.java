import java.util.Scanner;
public class dynamic_initialization
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();//D I
        int b=a; //dynamic Initialization
        System.out.println("The value you enterned is " +b);
    }
}