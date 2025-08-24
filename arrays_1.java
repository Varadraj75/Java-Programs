import java.util.Scanner;
public class arrays_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        double a[] = new double[5];
        System.out.println("Enter 5 numbers");
        for(int i =0; i<5; i++)
        {
            a[i]= sc.nextDouble();
        }
        
        for(int i =0; i<5; i++)
        {
            a[i]=10*a[i];
            
        }
        System.out.println(a);
    }
}