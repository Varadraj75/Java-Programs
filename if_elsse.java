import java.util.Scanner;
public class if_elsse{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet a number to connect ");
        int num = sc.nextInt();
        
        if(num>=0 && num<=10 || num==69)
        {
            System.out.println("login");
        }
        else
        {
            System.out.println("login failed");
        }
    }
}