public class function
{
    public static int xyz(int length ,  int breadth)
    {
       int abc = length*breadth; 
       return abc;
    }
    public static double xyz(double length, double breadth, double less)
    {
        double bca = length+breadth;
        return bca;
    }
    public static void main(String args[])
    {
        int c= xyz(4,5);
        double d = xyz(4.2,4.6,5.1);
        
        System.out.println(c);
        System.out.println(d);
        
        
    }
}