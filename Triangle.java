import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    double side1, side2 , side3;
    System.out.print("Enter the 3 side of the Triangle");
    side1 = sc.nextDouble();
    side2 = sc.nextDouble();
    side3 = sc.nextDouble();
    if(side1 == side2 && side2 == side3) 
        {
            System.out.println("It is an Equilateral Triangle");
        }    
        else if(side1 == side2 || side2 == side3 || side1 == side3) 
        {
            System.out.println("It is an Isosceles Triangle");
        } 
        else 
        {
            System.out.println("It is a Scalene Triangle");
        }
    }
}