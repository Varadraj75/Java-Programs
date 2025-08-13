import java.util.Scanner;
public class vowels_COUNTER
{
    public static void main(String args[])
    {
        String str = "AEIOUaeiouABCJWabxxc";
        int s = str.length();
        
        for(int i=0; i<s; i++)
        {
            char ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) > -1)
            {
                System.out.println(ch);
            }
        }
    }
}