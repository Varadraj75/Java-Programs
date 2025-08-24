public class function_overloading
{
    private static int area(int length, int breadth)
    {
        int area1 = length*breadth;
        return area1;
        
    }
    public static double area(double len, double bre)
    {
        double area2 = len*bre;
        return area2;
    }
    public static void main(String args[])
    {
        int area_1 = area(10,30);
        double area_2 = area(2.0f,8.0f);
        System.out.println("Area 1:- "+area_1);
        System.out.println("Area 2:- " +area_2);
        
    }
}