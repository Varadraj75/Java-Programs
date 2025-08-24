import java.util.Scanner;
public class arrays_sum_product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[10];
        System.out.println("Enter 10 number to find sum and product of it");
        
        for(int i = 0; i<10; i++)
        {
            a[i] = sc.nextInt();
        }
        
        int s =0,p=1;
        for(int i = 0; i<10; i++)
        {
            s=s+a[i];
            p=p*a[i];
        }
        System.out.println("The sum of 10 numbers are "+s);
        System.out.println("The product of 10 numbers are "+p);
    }
}