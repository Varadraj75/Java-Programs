import java.util.Scanner;
public class piglatin 
{
    public static void main(String args[])
    {
        String word,str="";
        char ch;
        int i,x,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        word=sc.nextLine().trim().toUpperCase();

        x=word.length();
        for(i=0;i<x;i++)
        {
            ch=word.charAt(i);
            if(i==0 && (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
            {
                flag=1;
                break;
            }
            
            if(i>0 && (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
            {
                flag=2;
                break;
            }
        }
        
        if(flag==1)
            str=word.substring(i)+"Y";
        if(flag==2)
            str=word.substring(i)+word.substring(0,i)+"C";
        if(flag==0)
            str=word.substring(0)+"N";
        
            System.out.println(str);
    }
}