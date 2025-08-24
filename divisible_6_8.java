import java.util.Scanner;
public class divisible_6_8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check wheather the number is divisble by 6 or 8");
        int num = sc.nextInt();
        if(num%6==0)
        {
            System.out.println("The number is divisble by 6");
        }
        else if(num%8==0)
        {
            System.out.println("The number is divisble by 8");
        }
        else
        {
            System.out.println("The number is not divisble by 6 and 8");
        }
    }
}