import java.util.Scanner;
public class CartonBox 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of boxes: ");
        int n = in.nextInt();

        if (n < 1 || n > 1000) 
        {
            System.out.println("INVALID INPUT");
            return;
        }

        int cartonSizes[] = {48, 24, 12, 6};
        int totalCartons = 0;
        int remainingBoxes = n;

        for (int i = 0; i < cartonSizes.length; i++) 
        {
            int cartonCount = remainingBoxes / cartonSizes[i];
            remainingBoxes = remainingBoxes % cartonSizes[i];
            totalCartons += cartonCount;

            if (cartonCount != 0) 
            {
                System.out.println(cartonSizes[i] + " * " + cartonCount + 
                    " = " + (cartonSizes[i] * cartonCount));
            }
        }

        if (remainingBoxes != 0) 
        {
            System.out.println("Remaining boxes = " + remainingBoxes + " * 1 = " + remainingBoxes);
            totalCartons++;
        } else 
        {
            System.out.println("Remaining boxes = 0");
        }

        System.out.println("Total number of boxes = " + n);
        System.out.println("Total number of cartons = " + totalCartons);
    }
}
