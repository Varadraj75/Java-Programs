import java.util.Scanner;
public class array_binary_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = 0, flag=0;
        String a[] = {"ADITYA","BIDYA","JITESH","VARAD","UDAY"};
        int total[] = {400,520,420,325,530};
        for(i=0; i<5; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter a name");
        String name = sc.nextLine();
        int f=0,l=4,m=0;
        while(f<=l)
        {
            m=(f+l)/2;
            if(name.compareTo(a[m])==0)
            {
                flag=1;
                break;
            }
            else if(name.compareTo(a[m])<0)
            {
                l=m-1;
            }
            else
            {
                f=m+1;
            }
        }
        if(flag==0)
        {
            System.out.println("Search element not found");
        }
        else
        {
            System.out.println("Search element found at cell number "+(m+1));
            System.out.println("Name is: "+a[m]);
            System.out.println("Total mark is: "+total[m]);
        }
    }
}