import java.util.Scanner;
public class sort_form2
{
    public static void main(String args[])
    {
        int a,i,x;
        char ch;
        String sen,str="",w="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen = sc.nextLine().toUpperCase();
        sen=sen.trim();
        sen=" "+sen;
        a=sen.length();
        x=sen.lastIndexOf(' ');
        w=sen.substring(x+1);
        
        for(i=0;i<x;i++)
        {
            ch=sen.charAt(i);
            
            if(ch==32)
            {
                ch=sen.charAt(i+1);
                str=str+ch+'.';
                
            }
        }
        str=str+" "+w; //output:- S.C. Bosh
        //str = w+" "+str; //output: - Bosh s.c.
        System.out.println(str);
    }
}