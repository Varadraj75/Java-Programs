import java.util.Scanner;
public class palindrom
{
     boolean checkPalindrome(String s)
    {
        String rev="";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            rev = c+rev;
            
        }
        if(s.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        palindrom obj = new palindrom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine().toUpperCase();
        s = s+" ";
        int start=0;
        String word ="";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch == ' ')
            {
               word = s.substring(start,i);
               start = i+1;
               
               if(obj.checkPalindrome(word))
               {
                   System.out.println(word);
               }
               
            }
        }
    }
}