import java.util.Scanner;
public class vowel
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabhet to check wheather it is a vowel or consonant");
        char a = sc.next().charAt(0);
        if(a == 'a' || a == 'e' || a== 'i' || a=='o' || a== 'u')
        {
            System.out.println("alphabhet is vowel");
        }
        else 
        {
            System.out.println("alphabhet is consonant");
        }
    }
}