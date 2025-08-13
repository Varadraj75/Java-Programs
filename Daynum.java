    import java.util.*;
public class Daynum
{
  public static void main(String args   [])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter day number(should be between 1 and 366) : ");
    int day=sc.nextInt();
    
    System.out.print("Enter the year : ");
    int year=sc.nextInt();
    
    System.out.print("Enter days later : ");
    int n=sc.nextInt();
    
    if(day<1||day>366||n<1||n>366)
    System.out.println("Wrong input");
    else
    {
      Calendar cal=Calendar.getInstance();
      cal.set(Calendar.YEAR,year);
      cal.set(Calendar.DAY_OF_YEAR,day);
      
      System.out.print("Entered date : ");
      System.out.printf("%tB %td %tY",cal,cal,cal);
      System.out.println();
      
      cal.add(Calendar.DAY_OF_YEAR,n);
      System.out.print(n+" days later : ");
      System.out.printf("%tB %td %tY",cal,cal,cal);
      
    }
  }
}