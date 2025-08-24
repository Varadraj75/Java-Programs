import java.util.Scanner;
public class array_largest_smallest_strings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String a[] = new String[5];
        System.out.println("Enter 5 elements to find the largest and the smallest");
        for(int i=0; i<5; i++)
        {
            a[i] = sc.nextLine();
        }
        String l = a[0], s= a[0];
        for(int i = 0 ; i<5; i++)
        {
            if(a[i].compareTo(l)>0)
            {
                l=a[i];
            }
            else if(a[i].compareTo(s)<0)
            {
                s=a[i];
            }
        }
        System.out.println("The largest number in the array is "+l);
        System.out.println("The Smallest number in the array is "+s);
    }
}