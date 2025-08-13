import java.util.*;
public class ISC_01
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boxes");
        int n = sc.nextInt();
        if(n<1||n>1000)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int cart[]= {48,24,12,6};
            int copy=n;
            int totalcart=0,count=0;
            System.out.println("output:");
            for(int i=0; i<4; i++)
            {
                count=n/cart[i];
                if(count!=0)
                {
                    System.out.println("\t"+cart[i]+"\tx"+count+cart[i]*count);
                    totalcart=totalcart+count;
                    n=n%cart[i];
                }
            }
            if(n>0)
            {
                System.out.println("Remaining Boxes"+n+"x1="+n);
                totalcart=totalcart+1;
            }
            else
            {
                System.out.println("remaining boxes= 0");
            }
            System.out.println("total number of boxes ="+copy);
            System.out.println("total number of cartons="+totalcart);
        }
    }
}