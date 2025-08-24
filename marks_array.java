import java.util.Scanner;
public class marks_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x=3, i=0;
        String name[]= new String[x];
        int s1[] = new int[x];
        int s2[] = new int[x];
        int s3[] = new int[x];
        int s4[] = new int[x];
        int s5[] = new int[x];
        int s6[] = new int[x];
        double total[] = new double[x];
        double average[] = new double[x];
        String grade[] = new String[x];
        for( i = 0; i<x; i++)
        {
            System.out.print ("Enter the name of the students ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print ("Enter the marks of the students in computer ");
            s1[i] = sc.nextInt();
            System.out.print ("Enter the marks of the students in maths ");
            s2[i] = sc.nextInt();
            System.out.print ("Enter the marks of the students in physics ");
            s3[i] = sc.nextInt();
            System.out.print ("Enter the marks of the students in Hindi ");
            s4[i] = sc.nextInt();
            System.out.print ("Enter the marks of the students in English ");
            s5[i] = sc.nextInt();
            System.out.print ("Enter the marks of the students in Biology ");
            s6[i] = sc.nextInt();
        }
        for( i =0; i<x; i++)
        {
            total[i] = s1[i]+s2[i]+s3[i]+s4[i]+s5[i]+s6[i];
            average[i] = total[i]/6;
            if(average[i]>=90)
            {
                grade[i] ="A+";
            }
            else if(average[i]>=70 && average[i]<=89)
            {
                grade[i] = "A";
            }
            else if(average[i]>=60 && average[i]<=69)
            {
                grade[i] = "B";
            }
            else if(average[i]>=50 && average[i]<=59)
            {
                grade[i] = "C";
            }
            else if(average[i]>=40 && average[i]<=49)
            {
                grade[i] = "D";
            }
            else if(average[i]<40)
            {
                grade[i] = "F";
            }
        }
        System.out.println("Name  Total  Average  Grade");
        System.out.println("---------------------------");
        for(i=0; i<x; i++)
        {
            System.out.println(name[i]+"  "+total[i]+"  "+average[i]+"  "+grade[i]);
        }
    }
}