package MyApps.ShapeAreaCalculator;
import java.util.Scanner;

public class triangle extends shapes2D {
    public double base;
    public double myArea() {
        System.out.println("Please enter the base of the triangle");
        Scanner myTrianglScanner = new Scanner(System.in);
        base = myTrianglScanner.nextDouble();

        System.out.println("Thank you!\n Now please enter the height of the triangle");
        height = myTrianglScanner.nextDouble();

        double myTriangleArea = 0.5 * base * height;
        myTrianglScanner.close();
        return myTriangleArea;
        
    }
    
}
