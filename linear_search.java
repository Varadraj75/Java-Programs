import java.util.Scanner;
public class linear_search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i=0, flag=0;
        int num[] = new int[5];
        System.out.print("Enter 5 number");
        for(i=0; i<5; i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.print("Input a number to search : ");
        int number = sc.nextInt();
        
        for(i=0; i<5; i++)
        {
            if(number==num[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("the search number is not found");
        }
        else
        {
            System.out.println("the search number is found in cell number "+(i+1));
        }
    }
}