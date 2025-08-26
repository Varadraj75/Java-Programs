import java.util.Scanner;
public class SelectionSort_ascending
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i =0,j=0,temp=0;
        int a[] = new int[5];
        System.out.println("Enter 5 number");
        for(i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("array before sorting: ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+",");
        }
        //selection sort techniq
        int s=0,pos=0;
        for(i=0; i<4; i++)
        {
            s=a[i];
            pos=i;
            for(j=i+1; j<5; j++)
            {
                if(a[j]<s)
                {
                    s=a[j];
                    pos=j;
                }
            }
            temp=a[pos];
            a[pos]=a[i];
            a[i]=temp;
        }
        
        System.out.println("\narray after sorting: ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+",");
        }
    }
}