import java.util.Scanner;
public class string_question
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen = sc.nextLine();
        int uc=0;
        int lc=0;
        int dg=0;
        int se=0;
        for(int i=0; i<sen.length(); i++)
        {
            char ch = sen.charAt(i);
            
            if(Character.isUpperCase(ch))
            {
                uc++;
            }
            else if(Character.isLowerCase(ch))
            {
                lc++;
            }
            else if(Character.isDigit(ch))
            {
                dg++;
            }
            else if(ch=='!' || ch ==':' || ch=='&' || ch== '.' || ch=='@')
            {
                se++;
            }
        }
        
        System.out.println("UpperCase "+uc);
        System.out.println("LowerCase "+lc);
        System.out.println("Digit "+dg);
        System.out.println("Special charcter "+se);
    }
}
