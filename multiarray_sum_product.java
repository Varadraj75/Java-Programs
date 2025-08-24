import java.util.Scanner;
public class multiarray_sum_product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int s=0,p=1;
        int x[][]= new int[3][5];
        
        System.out.println("Enter the value into 3x5 matrix");
        for(int i=0; i<3; i++)
        {
            for(int j =0; j<5; j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++)
        {
            for(int j =0; j<5; j++)
            {
                s=s+x[i][j];
                p=p*x[i][j];
            }
        }
        System.out.println("The sum of matrix is "+s);
        System.out.println("The product of matrix is "+p);
    }
}