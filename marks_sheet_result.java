import java.util.Scanner;
public class marks_sheet_result
{
    public static void main(String args[])
    {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter the marks you have gain");
        int marks = so.nextInt();
        if(marks<=100 && marks>=80)
        {
            System.out.println("A+ Grade");
        }
        else if(marks<=80 && marks>=70)
        {
            System.out.println("B Grade");
        }
        else if(marks<=70 && marks>=40)
        {
            System.out.println("c Grade");
        }
        else
        {
            System.out.println(" D Grade");
        }
    }
}