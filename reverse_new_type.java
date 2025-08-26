import java.util.Scanner;
public class reverse_new_type 
{
    public static void main(String args[])
    {
        String sen,mid,str="",w="",rev="";
        int i,x,len;
        char ch,ch1,ch2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen=sc.nextLine().trim();
        sen=sen+" ";
        x=sen.length();
        for(i=0; i<x; i++)
        {
            ch=sen.charAt(i);
            w=w+ch;
            if(ch==32)
            {
                w=w.trim();
                len=w.length();
                if(len>1)
                {
                    ch1=w.charAt(0);
                    mid=w.substring(1,len-1);
                    ch2=w.charAt(len-1);
                    str=ch2+mid+ch1;
                    rev=rev+str+" ";
                    str="";
                    w="";
                }
                else
                {
                    rev=rev+w+" ";
                    w="";
                }
            }
        }
        System.out.println(rev);

    }
}