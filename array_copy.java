import java.util.Scanner;
public class array_copy
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[10];
        System.out.println("Enter the element in first array");
        for(int i = 0; i<10; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[10];
        for(int i = 0 ; i<10; i++)
        {
            b[i] = a[i];
        }
        System.out.println("The no. in second array are: ");
        for(int i = 0; i<10; i++)
        {
            System.out.println(b[i]);
        }
    }
}