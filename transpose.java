import java.util.Scanner;
public class transpose
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i=0,j=0;
        int a[][]= new int[2][3];
        System.out.println("Enter elements into 2x3 matrix ");
        for(i=0; i<2; i++)
        {
            for(j=0; j<3; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("original 2x3 matrix elements are ");
        for(i=0; i<2; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("transpose 2x3 matrix elements are ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}