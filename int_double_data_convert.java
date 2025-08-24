import java.util.Scanner;
public class int_double_data_convert
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you want to convert to double data type");
        int a = sc.nextInt();
        double b = a;
        
        System.out.println("The double data type = "+b);
    }
}