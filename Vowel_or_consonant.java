import java.util.Scanner;
public class Vowel_or_consonant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabhet to check wheather it is a Vowel or Consonant");
        char ch = sc.next().charAt(0);
        if(ch== 'a' || ch== 'e' || ch== 'i' || ch=='o' || ch=='u')
         {
            System.out.println("it is a vowel");
         }
        else 
         { 
            System.out.println("it is a consonant");
         }
    }
}