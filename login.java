import java.util.Scanner;
public class login
{
    public static int id = 123;
    public static int password = 123;
    public static void a()
    {
        int flag1 =0 , flag2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\fEnter id");
        int id1 = sc.nextInt();
        System.out.println("Enter password");
        int pass1 = sc.nextInt();
        if(id==id1)
        {
            flag1 =1 ;
        }
        if(password == pass1)
        {
            flag2 = 1;
        }
        
        if(flag1==1 && flag2 ==1)
        {
            System.out.println("Welcome to code");
        }
        else
        {
            System.out.println("Wrong id or pass");
            System.out.println("Try again.....Then press y/Y......");
            char y = sc.next().charAt(0);
            if(y=='Y' || y=='y')
            a();
            else
            {
                System.out.println("good bye");
                System.exit(0);
            }
        }
    }
}