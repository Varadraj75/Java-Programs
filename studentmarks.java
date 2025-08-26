import java.util.Scanner;
public class studentmarks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:- ");
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        
        System.out.println("Enter the class of the students:- ");
        int c1 = sc.nextInt();
        
        System.out.println("Enter the marks of 3 students in computer science");
        double cs1 = sc.nextDouble();
        double cs2 = sc.nextDouble();
        double cs3 = sc.nextDouble();
        
        System.out.println("Enter the marks of 3 students in maths");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        
        System.out.println("Enter the marks of 3 students in Science");
        double sci1 = sc.nextDouble();
        double sci2 = sc.nextDouble();
        double sci3 = sc.nextDouble();
        
        double average1 = (cs1+m1+sci1)/3;
        double average2 = (cs2+m2+sci2)/3;
        double average3 = (cs3+m3+sci3)/3;
        
        double sum1 = cs1+cs2+cs3;
        double sum2 = m1+m2+m3;
        double sum3 = sci1+sci2+sci3;
        
        System.out.println("The average of " +s1 +" " +average1);
        System.out.println("The average of " +s2 +" " +average2);
        System.out.println("The average of " +s3 +" " +average3);
        
        System.out.println("The sum of marks in science " +sum3);
        System.out.println("The sum of marks in maths " +sum2);
        System.out.println("The sum of marks in Computer Science " +sum1);
    }
}