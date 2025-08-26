import java.util.Scanner;
public class program_344_func
{
    public static void main(String args[])
    {
        String word,rev="";
        int i,x;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine().trim().toUpperCase();
        
        print(word);
        x=word.length();
        for(i=0; i<x; i++)
        {
            ch=word.charAt(i);
            rev=ch+rev;
        }
        print(rev);
    }
    public static void print(String word)
    {
        String str1="";
        int i,x;
        char ch;
        x=word.length();
        for(i=0; i<x; i++)
        {
            if(i!=x-1)
                str1=str1+word.substring(i,i+1)+"-";
            else
                str1=str1+word.substring(i,i+1);
        }
        
        System.out.println(str1);
    }
}