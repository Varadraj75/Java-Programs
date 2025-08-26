import java.util.Scanner;
public class sort_form
{
    public static void main(String args[])
    {
        int a,i;
        char ch;
        String sen,str="",w="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen = sc.nextLine().toUpperCase();
        sen=sen.trim();
        sen=" "+sen;
        a=sen.length();
        
        for(i=0;i<a;i++)
        {
            ch=sen.charAt(i);
            
            if(ch==32)
            {
                ch=sen.charAt(i+1);
                str=str+ch+'.';
                
            }
        }
        System.out.println(str);
    }
}