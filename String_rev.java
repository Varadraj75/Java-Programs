import java.util.Scanner;
public class String_rev 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.nextLine();
        
        /*for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            System.out.print(ch);
        }*/
        String rev ="";
         for(int i=str.length()-1; i>=0; i--)
        {
            char c = str.charAt(i);
            rev += c;
            
        }
        
        System.out.println(rev);

        
    }
}