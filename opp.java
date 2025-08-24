import java.util.Scanner;
public class opp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbeer");
        int num = sc.nextInt();
        int result =1;
        for(int i =1; i<=num; i++)
        {
            result = result*i;
        }
        System.out.println(result);
    }
}