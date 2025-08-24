public class b 
{
    public static int y =1; 
    public static void natural()
    {
        System.out.println(y);
        y++;
        if(y<=10)
        {
            natural();
        }
    }
    /*public static void main()
    {
        b obj = new b();
        obj.natural();
    }*/
}