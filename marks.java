import java.util.Scanner;
public class marks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name of student ");
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        String s3= sc.nextLine();
        System.out.print("Enter the class of the students");
        int c1 = sc.nextInt();
        
        System.out.println("Enter the marks of Maths");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        
        System.out.println("Enter the marks of English");
        int e1 = sc.nextInt();
        int e2 = sc.nextInt();
        int e3 = sc.nextInt();
        
        System.out.println("Enter the marks of Science");
        int sci1 = sc.nextInt();
        int sci2 = sc.nextInt();
        int sci3 = sc.nextInt();
        
        int t1 = m1+e1+sci1;
        int t2 = m2+e2+sci2;
        int t3 = m3+e3+sci3;
        
        int av1 = t1/3;
        int av2 = t2/3;
        int av3 = t3/3;
        
        System.out.println("Marks of" +s1 +t1);
    }
}

