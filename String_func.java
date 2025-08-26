import java.util.Scanner;
public class String_func
{
    public static void main(String args[])
    {
        int i ,l,p,x,x1;
        char ch;
        String str1 ="", str2="",str = "Ashok the Great",s1="",s2="";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sen = sc.nextLine();
        System.out.println(sen);
        sen=sen.trim();
        System.out.println(sen);
        
         l = sen.length();
        System.out.println("length = "+l);
        
        for( i=0; i<l; i++)
        {
            ch=sen.charAt(i); //pick one character at once n store in ch
            str1=str1+ch;
            str2=ch+str2;
        }
        
        System.out.println(str1);
        System.out.println(str2);
        if(sen.equals(str2))
        {
            System.out.println("it is a palindrom");
        }
        else
        {
            System.out.println("it is not a palindrom");
        }
        
        if(sen.equalsIgnoreCase(str2)) //in this method it is comparing a normal string and a reverse string
        {
            System.out.println("it is a palindrom");
        }
        else
        {
            System.out.println("it is not a palindrom");
        }
        System.out.println(".........................");
        
        ch = str.charAt(4); //by using the character variable we are extracting the String value by giving the input of the index
        System.out.println(ch);
        i = str.indexOf('k');// by using int type we are getting the index value of the character
        System.out.println(i);
        i = str.indexOf('z'); //if the value of string is not find in the sentence then it will give -1 value 
        System.out.println(i); 
        
        p=str.indexOf(' '); //to get the index of space
        System.out.println(p);
        System.out.println(".........");
        i=str.indexOf('t',p); // to get the index of t after first space
        System.out.println(i);
        System.out.println(".........");
        p=str.indexOf(' ',p+1); // to get the index of space after first space
        System.out.println(p); 
        System.out.println(".........");
        //i=str.indexOf('t',p); //to get the index of t after second  space
        //System.out.println(i);  
        System.out.println("..........................");
        
        s1=str.substring(6,9); //pick a set of characters from a sentence or a word
        System.out.println(s1);
        s2=str.substring(i,p);
        System.out.println(s2);
        
        s2=str.substring(p+1);
        System.out.println(s2);
        
        x=str.lastIndexOf('t');
        System.out.println(x);
        x=str.lastIndexOf('t',9);
        System.out.println(x); 
        
        s1 = str.replace('t','*');
        System.out.println(s1);
        
        boolean y = str.startsWith("A");
        System.out.println(y);
         y = str.startsWith("Ash");
        System.out.println(y);
         y = str.endsWith("t");
        System.out.println(y);
         y = str.endsWith("Great");
        System.out.println(y);
        
    
        
        
        
    }
}