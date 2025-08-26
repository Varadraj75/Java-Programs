import java.util.Scanner;
public class SpyNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check wheather the number is a spy number or not");
        int number = sc.nextInt();
        
        int sum=0;
        int product=1;
        int temp=number;
        
        while(temp>0)
        {
            int digit=temp%10;
            sum=sum+digit;
            product*=digit;
            temp /=10;
        }
        
        if(sum==product)
        {
            System.out.println(number+"is a spy number");
        }
        else
        {
            System.out.println(number+"is not a spy number");
        }
        
        
    }
}