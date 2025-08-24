import java.util.Scanner;
public class array_largest_smallest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[20];
        System.out.println("Enter 20 elements to find the largest and the smallest");
        for(int i=0; i<20; i++)
        {
            a[i] = sc.nextInt();
        }
        int l = a[0], s= a[0];
        for(int i = 0 ; i<20; i++)
        {
            if(a[i]>l)
            {
                l=a[i];
            }
            else if(a[i]<s)
            {
                s=a[i];
            }
        }
        System.out.println("The largest number in the array is "+l);
        System.out.println("The Smallest number in the array is "+s);
    }
}