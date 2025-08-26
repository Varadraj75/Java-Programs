import java.util.Scanner;
public class swtichc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                {
                    System.out.println("it is sunday");
                }
            case 2:   
                                {
                    System.out.println("it is monday");
                }
            case 3:
                {
                    System.out.println("it is tuesday");
                }
            case 4:
                {
                    System.out.println("it is wednesday");
                }
            case 5:
                {
                    System.out.println("it is thursday");
                }
                case 6:
                {
                    System.out.println("it is friday");
                }
                case 7:
                {
                    System.out.println("it is saturday");
                }
                default:
                    {
                        System.out.println("it is  non other than bad day");
                    }
        }
    }
}