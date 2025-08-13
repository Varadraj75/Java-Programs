import java.util.Scanner;
public class Mix
{
     String wrd;
     int len;
     Mix()
     {
         wrd ="";
         len=0;
     }
     void feedword()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a word");
         wrd = sc.nextLine().toUpperCase();
         
     }
     void mix_word(Mix P, Mix Q)
     {
         P.len = P.wrd.length();
         Q.len = Q.wrd.length();
         int pi=0,qi=0;
         for(int i=0; i<P.len+Q.len; i++)
         {
             if(i%2==0 && pi<P.len)
             {
                 this.wrd=this.wrd+P.wrd.charAt(pi);
                 pi++;
             }
             else if(i%2!=0 && qi<Q.len)
             {
                 this.wrd=this.wrd+Q.wrd.charAt(qi);
                 qi++;
             }
         }
         if(P.len>Q.len)
         {
             this.wrd=this.wrd+P.wrd.substring(pi);
         }
         else
         {
             this.wrd=this.wrd+Q.wrd.substring(qi);
         }
     }
     void display()
     {
         System.out.println("Word: "+wrd);
     }
     public static void main(String args[])
     {
         Mix m1= new Mix();
         Mix m2 = new Mix();
         Mix m3 = new Mix();
         m1.feedword();
         m2.feedword();
         m3.mix_word(m1,m2);
         m1.display();
         m2.display();
         m3.display();
        
         
     }
}