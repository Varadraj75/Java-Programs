import java.util.Scanner;
public class sentence_reverse
{
    public static void main(String args[])
    {
        char ch;
        String sen,w="",str="";
        int i,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen=sc.nextLine().trim().toLowerCase();
        sen=sen+" ";
        x=sen.length();
        
        for(i=0;i<x;i++)
        {
            ch=sen.charAt(i);
            w=ch+w;
            if(ch==32)
            {
                str=str+w;
                w="";
            }
            
        }
        System.out.println(str);
    }
}