import java.util.Scanner;
public class sum_of_numbers_i
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=num; i++)
        {
            if(i <=num)
            {
                sum = sum+i;
            }
        }
        System.out.println("the sum of the first" +num+ "numbers from 1 to 120 is" +sum);
    }
}