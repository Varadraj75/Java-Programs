import java.util.Scanner;
public class divisible
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check wheather the number is divisible by 6 or8 : -");
        int a = sc.nextInt();
        if(a%6==0)
        {
            System.out.println("it is divisible by 6");
        }
        else if(a%8==0)
        
        {
            System.out.println("it is divisible by 8");
        }
        else 
        {
            System.out.println("it is not divisble by 6 or 8");
        }
    }
}