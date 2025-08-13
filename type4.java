import java.util.Scanner;
public class type4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String s = sc.nextLine().toUpperCase();

        s = s+" ";
        String word = ""; //to store word
        int start =0,count=0;

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c==' ')
                {
                    word = s.substring(start,i);
                    start = i+1;
                    
                    char c1= word.charAt(0); //starting character 
                    char c2 = word.charAt(word.length()-1);  //ending character
                    
                    
                    if(c1=='A'|| c1=='E'|| c1 == 'I' || c1 == 'O' || c1 =='U')
                    {
                        if(c2=='A'|| c2=='E'|| c2 == 'I' || c2 == 'O' || c2 =='U')
                        {
                            count ++;
                        }
                    }
                }
        }
        System.out.println(count); 
        
    }
}