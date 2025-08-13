import java.util.Scanner;
public class frequency
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen = sc.nextLine().toUpperCase();
        int count=0 ;
        for(char ch='A'; ch<='Z'; ch++)
        {
            count =0; 
            for(int i=0; i<sen.length(); i++)
            {
                if(ch==sen.charAt(i))
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println(ch+"\t"+count);
            }
        }
    }
}