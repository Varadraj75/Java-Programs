import java.util.Scanner;

public class Goldbach 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 9 || number >= 50) 
        {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            return;
        }

        if (number % 2 != 0)
        {
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            return;
        }

        System.out.println("Prime pairs are:");

        int first = 3;
        int second = 0;
        while (first <= number / 2) 
        {
            second = number - first;

            int count1 = 0, count2 = 0;
            for (int i = 1; i <= first; i++)
            {
                if (first % i == 0) count1++;
            }

            for (int i = 1; i <= second; i++) 
            {
                if (second % i == 0) count2++;
            }

            if (count1 == 2 && count2 == 2) 
            {
                System.out.println(first + ", " + second);
            }

            first += 2;
        }
    }
}
