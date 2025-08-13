import java.util.Scanner;
public class random
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boxes");
        int n =sc.nextInt();
        int size1=6;
        int size2= 12;
        int size3=24;
        int size4= 48;
        if(n>=1000)
        {
            System.out.println("invalid input");
        }
        /*double box48 = n/size4;
        double remainingbox = n%size4;
        double box24 = n/size3;
        remainingbox = n%size3;
        double box12 = n/size2;
        remainingbox = n%size2;
        double box6 = n/size1;
        remainingbox = n%size1;*/
        
        double box48 = n / size4;
        int remaining = n % size4;
        double box24 = remaining / size3;
        remaining = remaining % size3;
        double box12 = remaining / size2;
        remaining = remaining % size2;
        double box6 = remaining / size1;
        remaining = remaining % size1;
        
        System.out.println("Number of 48-boxes "+box48);
        System.out.println("Number of 24-boxes "+box24);
        System.out.println("Number of 12-boxes "+box12);
        System.out.println("Number of 6-boxes "+box6);
        double a = box48 + box24 + box12 + box6;
        System.out.println("total number of carton: "+a);
        System.out.println("remaing box "+remaining);
        System.out.println("total box "+n);
    }
}