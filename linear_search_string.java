import java.util.Scanner;
public class linear_search_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i=0, flag=0;
        String name[] = new String[5];
        System.out.print("Enter 5 name");
        for(i=0; i<5; i++)
        {
            name[i] = sc.nextLine();
        }
        System.out.print("Input a name to search : ");
        String n = sc.nextLine();
        
        for(i=0; i<5; i++)
        {
            if(n.equals(name[i]))//for string using .equal
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