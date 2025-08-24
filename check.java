import java.util.Scanner;
public class check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char num =sc.next().charAt(0);
        if(num>='A' && num<='Z')
        {
            System.out.println("it is an alphabet");
        }
        else if(num>='0' && num<='9')
        {
            System.out.println("it is an digit");
        }
        else
        {
            System.out.println("go back to grade 1");
        }
        
        
    }
}