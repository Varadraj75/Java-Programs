import java.util.Scanner;
public class sorting_
{
    public static void main(String args[])
    {
        String word,str="";
        int i,x,j;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word=sc.nextLine();
        x=word.length();
        //for(j=1; j<=256; j++) // for acending order
        for(j=256; j>=1; j--) // for decending order
        {
            for(i=0; i<x; i++)
            {
                ch=word.charAt(i);
                if(ch==j)
                {
                    str=str+ch;
                }
            }
        }
        System.out.println(str);
    }
}