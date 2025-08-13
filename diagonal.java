import java.util.Scanner;
public class diagonal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        
        System.out.println("Elements inside the array");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        int sumLd=0,sumRd=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    sumLd += a[i][j];
                }
                if(i+j==n-1)
                {
                    sumRd += a[i][j];
                }
            }
        }
        
        System.out.println("Sum of Left diagonal "+sumLd);
        System.out.println("Sum of Right diagonal "+sumRd);
        
        
        
    }
}
