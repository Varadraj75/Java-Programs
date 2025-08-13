import java.util.Scanner;
public class text
{
    static String str;
    static String nstr;
    
    text(String str , String nstr)
    {
        str ="";
        nstr="";
    }
    
    String reverse(String str)
    {
        int start =0; 
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
               nstr = str.substring(start,i);
               start = start+i;
               
               
            }
        }
        return nstr;
    }
    
    void display()
    {
        System.out.println(nstr);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String s = sc.nextLine().toUpperCase();
        
        s= s+" ";
        
        
        
        
        
    }

}