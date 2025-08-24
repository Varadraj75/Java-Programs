import java.util.*;
public class matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the matrix");
        int n = sc.nextInt();
        
        if(n<=2|| n>=10)
        {
            System.out.println("invalid input");
        }
        int a[] = new int[n];
        int aa[] [] = new int[n][n];
        
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        
        System.out.println("Sorted array");
        for(int i=0 ;i<n; i++)
        {
            System.out.println(a[i]);
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j<n-i)
                {
                    aa[i][j]=a[j];
                }
                else
                {
                    aa[i][j]=a[n-i-1];
                }
            }
        }
        
        System.out.println("Sorted 2d  array");
        
    }
}