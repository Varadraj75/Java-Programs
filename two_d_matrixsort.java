import java.util.*;
public class two_d_matrixsort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        
        int a[][]= new int[rows][colums];
        System.out.println("Enter the element");
        for(int i=0; i<rows-1; i++)
        {
            for(int j=0; j<(colums-1)-i; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int temp;
        for(int i=0; i<rows; i++)
        {
            for(int j=0; i<colums; j++)
            {
                for(int k=1; k<rows; k++)
                {
                    if(a[i][k-1]>a[i][k])
                    {
                        temp = a[i][k];
                        a[i][k] = a[i][k-1];
                        a[i][k-1] = temp;
                    }
                }
            }
        }
         
        for(int i=0; i<rows; i++)
        {
            for(int j=0; i<colums; j++)
            {
                System.out.println(a[i][j]);
            }
            System.out.println("");
        }
    }
}