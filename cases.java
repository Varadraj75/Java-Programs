import java.util.Scanner;
public class cases
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a case number");
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                {
                    System.out.println("chutiya");
                    break;
                }
            case 2:
                {
                    System.out.println("chutiya1");
                    break;
                }
            case 3:
                {
                    System.out.println("chutiya2");
                    break;
                }
                default:{
                    System.out.println(" not a chutiya");
                }
        }
    }
}