import java.util.Scanner;
public class program_344
{
    public static void main(String args[])
    {
        String word,str1="",str2="";
        int i,x;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine();
        
        x=word.length();
        for(i=0; i<x; i++)
        {
            ch=word.charAt(i);
            str1=str1+ch+"-";
        }
        for(i=0; i<x; i++)
        {
            ch=word.charAt(i);
            str2=ch+"-"+str2;
        }
        System.out.println(str1.trim());
         System.out.println(str2.trim());
    }
}