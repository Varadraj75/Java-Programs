import java.util.Scanner;
public class program_344_copy
{
    public static void main(String args[])
    {
        String word,str1="",str2="";
        int i,x;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine().trim().toUpperCase();
        
        x=word.length();
        for(i=0; i<x; i++)
        {
            if(i!=x-1)
                str1=str1+word.substring(i,i+1)+"-";
            else
                str1=str1+word.substring(i,i+1);
        }
        
       for(i=x-1; i>=0; i--)
        {
            if(i!=0)
                str2=str2+word.substring(i,i+1)+"-";
            else
                str2=str2+word.substring(i,i+1);
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}