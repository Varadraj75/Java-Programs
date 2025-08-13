import java.util.Scanner;
public class swap_diagonals
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        
        int a[][]= new int[n][n];
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
        
        
        for(int i=0; i<n; i++)
        {
            int temp = a[i][i];
            a[i][i] = a[i][n-i-1];
            a[i][n-i-1]=temp;
        }
        
        
        System.out.println("Interchange");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}