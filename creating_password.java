import java.util.Scanner;
public class creating_password
{
    public static void main(String args[])
    {
        String fn,ln,mn,s1,s2,s3,password="";
        int age,d1,d2;
        char ch1,ch2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        fn = sc.nextLine();
        System.out.println("Enter the middle name");
        mn = sc.nextLine();
        System.out.println("Enter the last name");
        ln = sc.nextLine();
        System.out.println("Enter the age");
        age = sc.nextInt();
        
        ch1=fn.charAt(0);
        ch2=fn.charAt(fn.length()-1);
        s1=ch1+""+ch2;
    
        ch1= mn.charAt(0);
        ch2=mn.charAt(mn.length()-1);
        s2=ch1+""+ch2;
        

        ch1= ln.charAt(0);
        ch2=ln.charAt(ln.length()-1);
        s3=ch1+""+ch2;
        
        d1=age%10;
        d2=age/10;
        
        password=s3+d2+s1+d1+s2;
        
        System.out.println("Password is "+password);
    }
}