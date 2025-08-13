public class lcm 
{
    static int i=1; 
    public static void main(String s[])
    {
        System.out.print(lcm(112,34));
    }
    public static int lcm(int a, int b)
    {
        if(a%b==0)
        {
            return a;
        }
        else 
        {
            return lcm(a+a/i++,b);
        }
    }
}