import java.util.Scanner;
public class week
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week days (1-7)");
        int days = sc.nextInt();
        if(days == 1)
        {
            System.out.println("It is Sunday");
        }
        else if(days == 2)
        {
            System.out.println("It is Monday");
        }
        else if(days == 3)
        {
            System.out.println("It is Tuesday");
        }
        else if(days == 4)
        {
            System.out.println("It is Wednesday");
        }
        else if(days == 5)
        {
            System.out.println("It is Thursday");
        }
        else if(days == 6)
        {
            System.out.println("It is Friday");
        }
        else if(days == 7)
        {
            System.out.println("It is Saturday");
        }
        else
        {
            System.out.println("Please enter a number between (1-7)");
        }
        
    }
}