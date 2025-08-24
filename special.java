import java.util.Scanner;
public class special 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabhet or special character");
        char a = sc.next().charAt(0);
        if(a>= 'a' && a<= 'z')
        {
            System.out.println("It is a alphabhet");
        }
        else if (a>= 'A' && a<= 'Z')
        {
            System.out.println("it is an capital alphabhet");
        }
        else if (a>= '0' && a<= '9')
        {
            System.out.println("it is a  number");
        }
        else
        {
            System.out.println("it is a symbol");
        }
    }
}