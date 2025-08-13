import java.util.Scanner;
public class quiz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of participants");
        int n =sc.nextInt();
        if(n < 4 || n > 10){
            System.out.println("INPUT SIZE OUT OF RANGE");
            return;
        }
    
            char arr[][]=new char[n][5];
            char key[] = new char[5];
            System.out.println("Enter the answer");
            for(int i=0; i<=n; i++)
            {
                System.out.println("Participant "+(i+1));
                for(int j=0; j<5; j++)
                {
                    arr[i][j]=sc.next().charAt(0);
                }
            }
            System.out.println("Enter the answer key");
            for(int i=0; i<5; i++)
            {
                key[i] = sc.next().charAt(0);
            }
            int hscore=0;
            int score[] = new int[n];
            System.out.println("Scores");
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<5; j++)
                {
                   if(arr[i][j]==key[j])
                   {
                       score[i]++;
                   }
                }            
        
        if(score[i]>hscore)
        {
            hscore=score[i];
        }
        System.out.println("Participant " + (i+1) + " = " + score[i]);
    }
    System.out.println("highest score: ");
    for(int i=0; i<n; i++)
    {
        if(score[i]==hscore)
        {
            System.out.println("participant "+(i+1));
        }
    }
    }

}