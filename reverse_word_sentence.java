import java.util.Scanner;
public class reverse_word_sentence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence");
        String sen = sc.nextLine();
        sen = sen.trim();
        sen = sen+" ";
        String word="",reva="";
        for(int i=0; i<sen.length(); i++)
        {
            char ch = sen.charAt(i);
            if(ch!=' ')
            {
                word = ch+word;
            }
            else
            {
                reva = reva+ch+word;
                word="";
            }
        }
        
        System.out.println(reva.trim());
        
        
        
    }
}