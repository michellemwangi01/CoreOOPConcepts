package MyApps.ShapeAreaCalculator;
import java.util.Scanner;

public class Parallelogram extends triangle {
    public double myArea() {


        System.out.println("Please enter the base of the parallelogram:");
        Scanner myParallelogramScanner = new Scanner(System.in);
        base = myParallelogramScanner.nextDouble();

        System.out.println("Thank you!\n \tNow please enter the height of the parallelogram:");
        height = myParallelogramScanner.nextDouble();
        double myParallelogramArea = base * height;
        myParallelogramScanner.close();
        return myParallelogramArea;
    }
}
