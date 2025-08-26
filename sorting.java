import java.util.Scanner;
public class sorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i=0,j=0; 
        String temp;
        String a []  = new String[10];
        for(i=0; i<10; i++)
        {
            System.out.println("Enter a name"+(i+1));
            a[i] = sc.nextLine();
        }
        
        
        for(i=0; i<9; i++)
        {
            for(j=0; j<9-i; j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        System.out.println("Array after sorting");
        for(i=0; i<10; i++)
        {
            System.out.println(a[i]+",");
        }
    }
}