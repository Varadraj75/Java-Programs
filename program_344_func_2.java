import java.util.Scanner;
public class program_344_func_2
{
    static String word,rev="",str1="";
    static int i,x;
    static char ch;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine().trim().toUpperCase();
        
        print(word);
        StringBuffer s1 = new StringBuffer(word);
        print(s1.reverse().toString());
    }
    public static void print(String word)
    {
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