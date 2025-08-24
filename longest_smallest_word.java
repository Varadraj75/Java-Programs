import java.util.Scanner;
public class longest_smallest_word
{
    public static void main(String args[])
    {
        int a,i,j,l=0,s;
        char ch;
        String sen,lw="",w="",sw="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen = sc.nextLine();
        sen=sen.trim();
        sen=sen+" ";
        a=sen.length();
        s=a;
        System.out.println("Words \t\t Length");
        System.out.println("..... \t\t ......");
        for(i=0;i<a;i++)
        {
            ch=sen.charAt(i);
            w=w+ch;
            if(ch==32)
            {
                w=w.trim(); 
                j=w.length();
                System.out.println(w+" \t\t "+j);
                if(j>l) //for finding the longest word and its length in the sentence
                {
                    l=j;
                    lw=w;
                }
                if(j<s) //for finding the smallest word and its length in the sentence
                {
                    s=j;
                    sw=w;
                }
                w="";
            }
        }
        System.out.println("The longest word="+lw);
        System.out.println("its length ="+l);
        System.out.println("The Smallest word="+sw);
        System.out.println("its length ="+s);
    }
}