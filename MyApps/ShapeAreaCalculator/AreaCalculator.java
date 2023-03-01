package MyApps.ShapeAreaCalculator;
import java.util.Scanner;

public class AreaCalculator {
 
    public static void main(String[] args) throws Exception {
        
        System.out.println("Please enter the shape who's area you want to calculate.\n (Example: Enter 1 for Triangle) \n 1. Triangle\n 2. Rectangle\n 3. Circle \n 4. Parallelogram \n");
        Scanner shapeChoiceScanner = new Scanner(System.in);
        int userShapeChoice = shapeChoiceScanner.nextInt();
        

        switch (userShapeChoice){
            case 1:
                System.out.println("You chose Triangle. \n");
                triangle mytTriangle1 = new triangle();
                System.out.println("The area of your triangle is:" + mytTriangle1.myArea());
                break;
            case 2:
                System.out.println("You chose Rectangle.\n");
                rectangle myRectangle1 = new rectangle();
                System.out.println("The area of your RECTANGLE is: " + myRectangle1.myArea() );
                break;
            case 3:
                System.out.println("You chose Circle.\n");
                Circle myCircle1 = new Circle();
                System.out.println("The area of your CIRCLE is:" + myCircle1.myArea());
                break;
            case 4:
                System.out.println("You chose Parallelogram.\n");
                Parallelogram mypParallelogram1 = new Parallelogram();
                System.out.println("Your parallelogram area is: " + mypParallelogram1.myArea());
                break;
            default:
                System.out.println("!!!!!!!!!!!Value Unknown, please enter value between 1 and 4!!!!!!!!!!!");

        }
        shapeChoiceScanner.close();
    
    }
}
