import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum");
        int number = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=number; i++)
        {
            sum+=i;  
        }
    System.out.println("the sum is" +sum);
}
}
