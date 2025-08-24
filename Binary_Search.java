import java.util.Scanner;
public class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = 0, flag=0;
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        
        for(i=0; i<10; i++)
        {
            System.out.println(a[i]);
        }
        
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int f=0,l=9,m=0;
        while(f<=l)
        {
            m=(f+l)/2;
            if(num==a[m])
            {
                flag=1;
                break;
            }
            else if(num<a[m])
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
        }
    }
}