import java.util.*;
public class boxess
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boxes");
        int n = sc.nextInt();
        int size1 = 6;
        int size2 = 12;
        int size3 = 24;
        int size4 = 48;
        if (n>= 1000)
        {
            System.out.println("Invalid input");
        }
        else
        {
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
        System.out.println("Remaining boxes "+remaining);
        System.out.println("Total boxes "+n);
        System.out.println("Number of cartons "+a);
    }
}
}
