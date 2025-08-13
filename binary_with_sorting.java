import java.util.Scanner;
public class binary_with_sorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of array");
        int size = sc.nextInt();
        int a [] = new int[size];
        System.out.println("Enter the value inside the array");
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
        int temp=0; 
        
        for(int i=0; i<size-1; i++)
        {
            for(int j=0; i<(size-1)-i; i++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        System.out.println("Enter the number to search");
        int search = sc.nextInt();
        
        int f=0,l=size-1, m=0, flag=0;
        while(f<=1)
        {
            m=(f+l)/2;
            if(search==a[m])
            {
                flag=1;
                break;
            }
            else if(search<a[m])
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
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element  found "+(m+1));
        }
    }
}