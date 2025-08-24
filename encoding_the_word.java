import java.util.Scanner;
public class encoding_the_word
{
    public static void main(String args[])
    {
        String word,str="";
        int i,x;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine().trim();
        x=word.length();
        for(i=0; i<x; i++)
        {
            ch=word.charAt(i);
            if((ch>='a' && ch<='m')||(ch>='A' && ch<='M'))
            {
                ch+=13;
            }
            else if((ch>='n' && ch<='z')||(ch>='N' && ch<='Z'))
            {
                ch-=13;
            }
            str=str+ch;
        }
        System.out.println(str);
    }
}
