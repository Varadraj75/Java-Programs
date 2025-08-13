import java.util.*;
public class calendar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        
        System.out.println("Enter the year");
        int year = sc.nextInt();
        
        System.out.println("Enter the days later");
        int n = sc.nextInt();
        
        if(day<1|day>366||n<1||n>366)
        {
            System.out.println("invalid input");
        }
        else
        {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR,year);
            cal.set(Calendar.DAY_OF_YEAR,day);
            
            System.out.print("The date is ");
            System.out.printf("%tB %td %tY ",cal,cal,cal);
            System.out.println();
            
            cal.set(Calendar.DAY_OF_YEAR,n);
            System.out.println(n+" Days later");
            System.out.printf("%tB %td %tY",cal,cal,cal);
        }
    }
}