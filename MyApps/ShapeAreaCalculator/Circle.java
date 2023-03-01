package MyApps.ShapeAreaCalculator;
import java.util.Scanner;

public class Circle extends shapes2D {
    public static float pi = 3.142f;
    public double radius;
    
    public double myArea() {
        System.out.println("Enter the radius of the circle: ");
        Scanner myCircleScanner = new Scanner(System.in);
        radius = myCircleScanner.nextInt();
        double myShapeArea = (double) (pi * (Math.pow(radius, 2)));
        myCircleScanner.close();
        return myShapeArea;
        
    }
}
