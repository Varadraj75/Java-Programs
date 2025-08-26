import java.util.Scanner;
public class temperature
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit that needed to be converted to celcius");
        double f = sc.nextDouble();
        System.out.println("Enter the celcius that needed to be converted to fahrenheit");
        double c = sc.nextDouble();
        
        //double c = 110; //this statement is for default input 
        //double f = 112;
        double fahrenheitformula = c*(9/5)+32;
        double celciusformula = (f-32)*5/9;
        System.out.println("The Fahrenheit is " +fahrenheitformula);
        System.out.println("The celcius is " +celciusformula);
    }
}