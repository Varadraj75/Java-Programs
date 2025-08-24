import java.util.Scanner;
public class length_of_each_word
{
    public static void main(String args[])
    {
        int a,i,j;
        char ch;
        String sen,str="",w="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen = sc.nextLine();
        sen=sen.trim();
        sen=sen+" ";
        a=sen.length();
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
                w="";
            }
        }
    }
}