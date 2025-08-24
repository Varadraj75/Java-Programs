import java.util.Scanner;
public class check_wheather_alphabetordigitorspecialcharacter
{
    public static void main(String args[])
    {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter a char");
        char num = so.next().charAt(0);
        if(num>= 'a' && num <= 'z' )
        {
            System.out.println("it is a alphabhet");
        
        }
        else if(num>= 'A' && num <='Z')
        {
            System.out.println("it is a Capital Alphabhet");
        }
        else if(num>= '0' && num<= '9')
        {
            System.out.println("it is a digit");
        }
        else
        {
            System.out.println("it is a special character");
        }
    }
}