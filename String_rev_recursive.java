import java.util.Scanner;
public class String_rev_recursive
{
    static String rev(String s)
    {
        if(s.length()==1)
        {
            return s;
        }
        else
        {
            return rev(s.substring(1))+s.charAt(0);
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        String rev ="";
        
        System.out.println("Reverse: "+rev(s));
    }
}