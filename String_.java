import java.util.Scanner;
public class String_
{
    public static void main(String args[])
    {
        int a,i;
        char ch;
        String sen,w="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen = sc.nextLine();
        sen=sen.trim();
        sen=sen+" ";
        a=sen.length();
        
        for(i=0;i<a;i++)
        {
            ch=sen.charAt(i);
            w=w+ch;
            if(ch==32)
            {
                w=w.trim();
                System.out.println(w);
                w="";
            }
        }
    }
}