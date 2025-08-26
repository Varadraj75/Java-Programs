import java.util.Scanner;
public class SelectionSort_ascending_String
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i =0,j=0;
        String temp="";
        String a[] = new String[5];
        System.out.println("Enter 5 names");
        for(i=0; i<5; i++)
        {
            a[i] = sc.nextLine();
        }
        System.out.println("names before sorting: ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+",");
        }
        //selection sort techniq
        String s="";
        int pos=0;
        for(i=0; i<4; i++)
        {
            s=a[i];
            pos=i;
            for(j=i+1; j<5; j++)
            {
                if(a[j].compareTo(s)<0)
                {
                    s=a[j];
                    pos=j;
                }
            }
            temp=a[pos];
            a[pos]=a[i];
            a[i]=temp;
        }
        
        System.out.println("\nnames after sorting: ");
        for(i=0; i<5; i++)
        {
            System.out.print(a[i]+",");
        }
    }
}