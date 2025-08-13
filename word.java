import java.util.Scanner;
public class word
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String a = sc.nextLine();
        
        int count =0; 
        int n = a.length();
        for(int i =0; i<n; i++)
        {
            char c = a.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}