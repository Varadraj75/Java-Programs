import java.util.Scanner;
public class Rearrange
{
    String Txt , Cxt;
    int len,flag,i;
    char ch;
    Rearrange()
    {
        Txt="";
        Cxt="";
        len=0;
    }
    void readword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        Txt=sc.nextLine().toUpperCase();
    }
    void convert()
    {
        for( i=0; i<Txt.length(); i++)
        {
            ch=Txt.charAt(i);
            if(i==0 && (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
            {
                flag=1;
                break;
            }
            if(i>0 && (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
            {
                flag=2;
                break;
            }
        }
        if(flag==1)
        {
            Cxt=Txt.substring(i)+"Y";
        }
        if(flag==2)
        {
            Cxt=Txt.substring(i)+Txt.substring(0,i)+"C";
        }
        if(flag==0)
        {
            Cxt=Txt.substring(0)+"N";
        }
    }
    void display()
    {
        System.out.println("Original word= "+Txt);
        System.out.println("Edited word= "+Cxt);
    }
    public static void main(String args[])
    {
        Rearrange obj1 = new Rearrange();
        obj1.readword();
        obj1.convert();
        obj1.display();
    }
}