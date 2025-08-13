import java.util.Scanner;
public class name_in_alphabetical_order
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter the amount of names you want to store");
        int n = sc.nextInt();
        String NAM [] = new String[n+1];
        System.out.println("Enter the names:- ");
        for(i=0; i<n+1;i++)
        {
            NAM[i] = sc.nextLine();
        }
        boolean check = true;
        for(i=1; i<n; i++)
        {
            if(NAM[i-1].compareToIgnoreCase(NAM[i])>0)
            {
                check = false;
                break;
            }
        }
        
        if (check) {
            System.out.println("The names are in alphabetical order.");
        } else {
            System.out.println("The names are not in alphabetical order.");
        }
    }
}