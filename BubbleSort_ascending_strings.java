import java.util.Scanner;
public class BubbleSort_ascending_strings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i =0,j=0;
        String temp;
        String a[] = new String[5];
        System.out.print("Enter 5 name");
        for(i=0; i<5; i++)
        {
            a[i] = sc.nextLine();
        }
        System.out.println("array before sorting: ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+",");
        }
        for(i=0; i<4; i++)
        {
            for(j=0; j<4-i; j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        System.out.println("\narray after sorting: ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+",");
        }
    }
}