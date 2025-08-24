import java.util.Scanner;
public class month_days
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the month in which you want to know about the days");
        int month = sc.nextInt();
        System.out.print("Enter the year");
        int year = sc.nextInt();
        if(month==2)
            {
                System.out.println("Number of days is 28");
            }
            else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            {
                System.out.println("Number of days is 31");
            }
            else
            {
                System.out.println("Number of days is 30");
            }
            
}
}
