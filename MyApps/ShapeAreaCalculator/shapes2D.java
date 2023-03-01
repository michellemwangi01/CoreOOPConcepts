package MyApps.ShapeAreaCalculator;
import java.util.Scanner;
public class shapes2D {
        //System.out.println("Please give me cube measurements"); 
        public double length;
        public double width;
        public double height;

        public double myArea() {
            System.out.println("LENGTH of your shape please: ");
            Scanner myScanner = new Scanner(System.in);
            length = myScanner.nextInt();
            System.out.println("WIDTH of your shape please: ");
            width = myScanner.nextInt();
            System.out.println("HEIGHT of your shape please: ");
            height = myScanner.nextInt();
            myScanner.close(); 

            double myShapeArea = length * width;
            return myShapeArea;
        }

        public double myShapeVolume(double length, double width, double height) {
            double myCubeVolume = length * width * height;
            return myCubeVolume;
            
        }
         
}



