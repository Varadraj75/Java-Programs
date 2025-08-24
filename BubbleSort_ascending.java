import java.util.Scanner;
public class BubbleSort_ascending
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i =0,j=0,temp=0;
        int a[] = new int[5];
        System.out.println("Enter 5 number");
        for(i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
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
                if(a[j]>a[j+1])
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