import java.util.Scanner;
public class vowels_consonents
{
    public static void main(String args[])
    {
        String sen,str="",s1="",s2="";
        int i,x;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sen = sc.nextLine().toLowerCase();
        x=sen.length();
        
        for(i=0;  i<x; i++)
        {
            ch=sen.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                s1=s1+ch; //adding only vowels 
            }
            else
            {
                s2=s2+ch; //adding other than vowels 
            }
        }
        str=s2+s1; // adding first conconents then vowels 
        System.out.println(str);
    }
}
/**Enter a sentence
varad
vrdaa*/