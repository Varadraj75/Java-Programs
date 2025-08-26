import java.util.Scanner;
public class program_344_func_3
{
    static String word,rev="";
    static int i,x;
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
        if(x>0)
        {
            System.out.print(word.substring(0,1));
            for(i=1; i<x; i++)
            {
                System.out.print("-"+word.substring(i,i+1));
            }
            System.out.println();
        }
    }
}